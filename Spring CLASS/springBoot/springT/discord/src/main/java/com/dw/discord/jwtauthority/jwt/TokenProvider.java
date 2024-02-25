package com.dw.discord.jwtauthority.jwt;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@Component
public class TokenProvider implements InitializingBean { // TokenProvider:  로그인 요청을 받았을 때 사용

   private final Logger logger = LoggerFactory.getLogger(TokenProvider.class);
   private static final String AUTHORITIES_KEY = "auth";
   private final String secret;
   private final long tokenValidityInMilliseconds;
   private Key key;

   public TokenProvider(
      @Value("${jwt.secret}") String secret,//
      @Value("${jwt.token-validity-in-seconds}") long tokenValidityInSeconds) {
      this.secret = secret;
      this.tokenValidityInMilliseconds = tokenValidityInSeconds * 1000;
   }

   @Override
   public void afterPropertiesSet() { /// secret: 호출의 시점을 조정 ( 이니셜 초기화가 끝난다음에 실행되도록 함(그렇치 않을 경우 null로 보여짐))
      byte[] keyBytes = Decoders.BASE64.decode(secret);
      this.key = Keys.hmacShaKeyFor(keyBytes);
   }

   public String createToken(Authentication authentication) {  // authentication에 로그인 정보가 담겨져 있음.
      String authorities = authentication.getAuthorities().stream() // stream()을 붙이면 연결되어 있는 정보를 하나하나 확인할 수 있음. (앞에 리스트 같은 배열형태가 있는데 stream이 뽑아줌)
         .map(GrantedAuthority::getAuthority) // 뽑아준 것을 map이 처리 
         //  .map(GrantedAuthority::getAuthority)는 map(grantedAuthority -> grantedAuthority.getAuthority()) 와 같음
         .collect(Collectors.joining(",")); // collect 는 문자열을 합치는 것과 비슷한 역할 
      //set(배열)로 되어 있는 것들을 (admin, user)이런 식(문자열로)으로 표시함( 토큰에 넣기 위해, 토큰은 전체가 String 이기 때문)

      long now = (new Date()).getTime();
      Date validity = new Date(now + this.tokenValidityInMilliseconds); // 만료 시간

      return Jwts.builder()
         .setSubject(authentication.getName()) //principal = userName 
         .claim(AUTHORITIES_KEY, authorities) //
         .signWith(key, SignatureAlgorithm.HS512) // 시그니처를 만들어라 //HS512는 정말 많이 쓰이는 암호화 방식
         .setExpiration(validity) // 만료시간
         .compact(); // 문자열로 변환해라
   }

   public Authentication getAuthentication(String token) { // 토큰에서 authentication 정보를 꺼내옴
      Claims claims = Jwts
              .parserBuilder()
              .setSigningKey(key)
              .build()
              .parseClaimsJws(token)
              .getBody(); // body내용을 꺼내겠다.

      Collection<? extends GrantedAuthority> authorities =
         Arrays.stream(claims.get(AUTHORITIES_KEY).toString().split(",")) // String으로 되어 있던 애들을 다시 배열형태로 바꿈
            .map(SimpleGrantedAuthority::new)
            // . map(authority -> new SimpleGrantedAuthority()) // authority를 만들어서 하나씩 집어넣어라
            .collect(Collectors.toList());

      User principal = new User(claims.getSubject(), "", authorities); // principal = userName

      return new UsernamePasswordAuthenticationToken(principal, null, authorities);
   }

   public boolean validateToken(String token) {
      try {
         Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token); // 이 토큰의 유효성을 체크함.// 키를 알려주고 아래에 있는 내용들을 체크함. // 토큰만 체크하고 보내줌.(비밀번호 등을 대조해 보지 않음)
         // setSigningKey(key)는 applicationn properties에 들어가 있는 키임.
         // session은 서버에 부담이 됨( 모든 서버가 세션을 가지고 있어야 하기 때문에 모든 서버를 동기화해야 하는 부담이 있음) token은 값싸면서 경우에 따라서는 보안성을 올릴 수 있음.
         return true;
      } catch (io.jsonwebtoken.security.SecurityException | MalformedJwtException e) { // Malformed : 토큰이 뭔가 잘못 고쳐짐( 내용이 잘못됨 = 변질됨)
         logger.info("잘못된 JWT 서명입니다."); // 무조건 찍힘
      } catch (ExpiredJwtException e) {
         logger.info("만료된 JWT 토큰입니다.");
      } catch (UnsupportedJwtException e) {
         logger.info("지원되지 않는 JWT 토큰입니다.");
      } catch (IllegalArgumentException e) {
         logger.info("JWT 토큰이 잘못되었습니다.");
      }
      return false;
   }
}
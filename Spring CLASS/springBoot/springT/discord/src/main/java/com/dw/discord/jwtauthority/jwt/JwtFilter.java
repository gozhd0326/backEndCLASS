package com.dw.discord.jwtauthority.jwt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.GenericFilterBean;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;

public class JwtFilter extends GenericFilterBean {  // GenericFilterBean을 상속받음

   private static final Logger logger = LoggerFactory.getLogger(JwtFilter.class); // jwtfilter를 클래스로 지정하여 클래스만 로깅할 수 있음.
   //코드가 정상적으로 실행되고 있는지 확인하기 위해 로깅을 사용 // 로깅의 레벨을 지정한다.(인포레벨과 디버그레벨)
   // 인포레벨 : 아주 중요하고 굵직한 것들만 // 디버그레벨 : 자잘한 것들만 		// 로깅하는 도구(툴) : import org.slf4j.Logger;
   public static final String AUTHORIZATION_HEADER = "Authorization"; // 실제로 토큰에 위치해야 하는 해당 키(헤더의 키) 
   private TokenProvider tokenProvider;
   public JwtFilter(TokenProvider tokenProvider) {
      this.tokenProvider = tokenProvider;
   }

   @Override // servletRequest를 받아 옴, servletResponse은 비어있어 여기에 담을 것임 // 두 필터에 토큰이 있어야 됨.(jwt 토큰을 확인하는 녀석)
   public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
      HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest; // http형태로 바꿈(캐스팅)
      String jwt = resolveToken(httpServletRequest);// httpServletRequest는 servletRequest를 상속받
      String requestURI = httpServletRequest.getRequestURI(); // 주소값이 여기에 들어감

      if (StringUtils.hasText(jwt) && tokenProvider.validateToken(jwt)) { // 토큰이 있는지 확인하고 토큰을 validation 체크(토큰을 validate한다=>)함.
         Authentication authentication = tokenProvider.getAuthentication(jwt); // 성공이면 .getAuthentication(jwt)(유저네임,권한)을 호출함. 
         SecurityContextHolder.getContext().setAuthentication(authentication); // SecurityContextHolder : 현재 사용자의 정보를 담아놓는 저장소 
         logger.debug("Security Context에 '{}' 인증 정보를 저장했습니다, uri: {}", authentication.getName(), requestURI); // 디버그 레벨
      } else {
         logger.debug("유효한 JWT 토큰이 없습니다, uri: {}", requestURI);
      }

      filterChain.doFilter(servletRequest, servletResponse); // doFilter : 필터들이 다 체인으로 묶여 있기 때문에 다음 체인에게 넘겨주는 역할을 함.
   }

   private String resolveToken(HttpServletRequest request) {  // servletRequest를 까봐야 함
      String bearerToken = request.getHeader(AUTHORIZATION_HEADER); //헤더에서 Authorization이름을 찾음

      if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) { // 그럼 그 값을  bearerToken에 담음(원래는 Bearer (Enter key) + 키 값)
         return bearerToken.substring(7);
      }

      return null;
   }
}
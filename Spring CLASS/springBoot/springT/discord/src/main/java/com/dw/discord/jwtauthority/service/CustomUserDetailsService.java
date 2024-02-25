package com.dw.discord.jwtauthority.service;

import com.dw.discord.exception.InvalidRequestException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dw.discord.jwtauthority.model.User;
import com.dw.discord.jwtauthority.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Component("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService { // UserDetailsService 은 토큰을 인증하기 위해서 UserDetails 정보를 사용한다고 알려줘야함 
	//UserDetail(객체형태)로 만들어야 privider가 인식할 수 있다 
   private final UserRepository userRepository;

   public CustomUserDetailsService(UserRepository userRepository) {
      this.userRepository = userRepository;
   }

   @Override
   @Transactional
   public UserDetails loadUserByUsername(final String username) {
      return userRepository.findOneWithAuthoritiesByUsername(username) // 유저 정보를 받아옴
         .map(user -> createUser(username, user))
         .orElseThrow(() -> new InvalidRequestException(username,
        		 username + " -> 데이터베이스에서 찾을 수 없습니다."));
   }

   private org.springframework.security.core.userdetails.User createUser( // createUser => UserDetails을 만듦
		   String username, User user) {
      if (!user.isActivated()) {
         throw new RuntimeException(username + " -> 활성화되어 있지 않습니다.");
      }

      List<GrantedAuthority> grantedAuthorities = user.getAuthorities().stream() // 한개 이상의 인증정보를 담음
              .map(authority -> new SimpleGrantedAuthority(authority.getAuthorityName())) // User 정보 (권한, 유저네임, 패스워드) 를 담아서 보내줌
              .collect(Collectors.toList());

      return new org.springframework.security.core.userdetails.User(user.getUsername(),
              user.getPassword(),
              grantedAuthorities);
   }
}
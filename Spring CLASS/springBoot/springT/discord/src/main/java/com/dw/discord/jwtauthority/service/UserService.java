package com.dw.discord.jwtauthority.service;

import java.util.Collections;

import com.dw.discord.exception.InvalidRequestException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dw.discord.jwtauthority.dto.UserDto;
import com.dw.discord.jwtauthority.model.Authority;
import com.dw.discord.jwtauthority.model.User;
import com.dw.discord.jwtauthority.repository.UserRepository;
import com.dw.discord.jwtauthority.util.SecurityUtil;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional
    public UserDto signup(UserDto userDto) {
        if (userRepository.findOneWithAuthoritiesByUsername(userDto.getUsername()) 
        		.orElse(null) != null) {
            throw new InvalidRequestException("Duplicated member","이미 가입되어 있는 유저입니다.");
        }

        Authority authority = new Authority(); 
        authority.setAuthorityName("ROLE_USER"); // 권한을 요청하면 user권한만 부여

        User user = new User();
        user.setUsername(userDto.getUsername()); // userEntity로 만듦
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setNickname(userDto.getNickname());
        user.setAuthorities(Collections.singleton(authority)); // 권한을 부여 // authority 하나만 들어가게끔 함 ( user 말고는 들어갈 수 있는 여지가 없음 )
        user.setActivated(true); // 회원가입할 때 활성화, 비활성화 시킴( 필요없는 회원은 기본적으로 비활성화 )

        return UserDto.from(userRepository.save(user)); // from은 현재 signup이 성공되면 userDto형태로 클라이언트에게 보내줌 //컨버젼(형태를 변환) userDto를 user로 
    }

    @Transactional(readOnly = true) 
    public UserDto getUserWithAuthorities(String username) { // user권한이 접근 가능 // DB에서 해당 유저정보를 얻어옴
        return UserDto.from(userRepository.findOneWithAuthoritiesByUsername(username)
        		.orElseThrow(() -> new InvalidRequestException(username,"member not found")));
    }

    @Transactional(readOnly = true)
    public UserDto getCurrentUserWithAuthorities() { // user와 admin 권한 상관없이 본인의 정보를 볼 수 있음 
        return UserDto.from(
                SecurityUtil.getCurrentUsername() // CurrentUsername을 저장해서 //  SecurityContextHolder 에 저장되어 있는 유저 정보를 가져옴
                        .flatMap(userRepository::findOneWithAuthoritiesByUsername) //map 형태로 저장  //map ( key : value )
                        .orElseThrow(() -> new InvalidRequestException("No current user","Current member not found"))
        );
    }
}
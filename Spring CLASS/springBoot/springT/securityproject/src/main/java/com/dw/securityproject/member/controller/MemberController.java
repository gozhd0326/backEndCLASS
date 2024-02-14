package com.dw.securityproject.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dw.securityproject.common.dto.BaseResponse;
import com.dw.securityproject.common.status.ResultCode;
import com.dw.securityproject.member.dto.MemberDto;
import com.dw.securityproject.member.dto.MemberLoginDto;
import com.dw.securityproject.member.service.MemberService;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/universe/member")
@CrossOrigin(origins="http://localhost:3000", 
	methods= {RequestMethod.GET, RequestMethod.POST})
public class MemberController {
	private MemberService memberService;
	@Autowired
	public MemberController(MemberService memberService) {
		super();
		this.memberService = memberService;
	}
	
	@PostMapping("signup")
	public ResponseEntity<BaseResponse<Void>> signUp(@RequestBody @Valid MemberDto memberDto) {
		return new ResponseEntity<BaseResponse<Void>>(
				new BaseResponse<Void>(ResultCode.SUCCESS.name(),
				null,
				memberService.signUp(memberDto)),
				HttpStatus.CREATED);
	}
	
	@PostMapping("login")
    public ResponseEntity<BaseResponse<String>> login(@RequestBody @Valid MemberLoginDto memberLoginDto) {
		   HttpHeaders headers = new HttpHeaders();
		    headers.setContentType(MediaType.APPLICATION_JSON); 
		String loginId = memberService.login(memberLoginDto);
		return new ResponseEntity<>(new BaseResponse<>(
        		ResultCode.SUCCESS.name(), 
        		loginId, 
        		memberService.login(memberLoginDto)), 
        		HttpStatus.OK) ;
    }
}

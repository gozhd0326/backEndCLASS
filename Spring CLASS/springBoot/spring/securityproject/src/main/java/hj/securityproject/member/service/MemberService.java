package hj.securityproject.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hj.securityproject.common.exception.InvalidInputException;
import hj.securityproject.member.dto.LoginDto;
import hj.securityproject.member.dto.MemberDto;
import hj.securityproject.member.model.Member;
import hj.securityproject.member.repository.MemberRepository;
import jakarta.transaction.Transactional;

@Transactional //Tranjection이 있어 DB를 효율적으로 관리
@Service
public class MemberService {

	private final MemberRepository memberRepository;

	@Autowired
	public MemberService(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
	}
	

	public String signUp(MemberDto memberDto) {
		//ID 중복 검사
		Member member = memberRepository.findByLoginId(memberDto.getLoginId());
		if(member != null) {
//			return "이미 등록된 아이디입니다.";
			throw new InvalidInputException("loginId","이미 등록된 아이디입니다.");
		}
		
		// Member 객체 생성 
		member = new Member(
				null, 
				memberDto.getLoginId(),
				memberDto.getPassword(),
				memberDto.getName(),
				memberDto.getBirthDate(),
				memberDto.getGender(),
				memberDto.getEmail()
				); //DTO를 Entity로 변경하는 코드
		//Repository 저장
		memberRepository.save(member);
		return "회원가입이 완료되었습니다.";
	}


	public String logIn(LoginDto loginDto) {
		Member member = memberRepository.findByLoginId(loginDto.getLoginId());
	     if (member != null && member.getPassword().matches(loginDto.getPassword())) {
	            return member.getLoginId();
	        } else {
	            throw new InvalidInputException("loginId", "ID 또는 Password가 올바르지 않습니다");
	        }
	    }
			
//	member = new Member2(
//			null,
//			loginDto.getLoginId(),
//			loginDto.getPassword()
	
	//login 만들기 / member가 null이면
	
	//멤버 dto를 받아다가 만들기...
	//Data Transform Object(DTO)-> 데이터 유효성 검사만 하는 레이어
}




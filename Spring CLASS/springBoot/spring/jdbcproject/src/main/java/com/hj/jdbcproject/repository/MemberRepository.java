package com.hj.jdbcproject.repository;

import java.util.List;
import java.util.Optional;

import com.hj.jdbcproject.model.Member;

public interface MemberRepository {

	//주석은 최대한 간단명료하게 한줄정도로 작성(명사 중심으로 작성)
	
	// 저장
	Member save(Member member);
	// id로 row찾기
	Optional<Member> findById(Long id);
	// 이름으로 row찾기
	Optional<Member> findByName(String name);
	// 모든 row찾기
	List<Member>findAll();

}

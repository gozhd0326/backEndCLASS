package com.dw.discord.jwtauthority.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "`user`") // 기존에 있던 member 대신에 사용함
public class User {
	@Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId; //자동으로 증가되는 ID.. 1,2,3,4....

    @Column(name = "username", length = 50, unique = true)
    private String username; // 로그인 ID

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "nickname", length = 50)
    private String nickname;

    @Column(name = "activated")
    private boolean activated; // 유저에게 활성화 비활성화를 셋팅함. ( 어떤 유저에게는 모든 권한을 제어하겠다. 관리자가 권한을 허용해야지만 접근 가능함)
    
    @ManyToMany // 다대다 관계 
    @JoinTable( // 한쪽에서만 만들면 됨 
    name = "user_authority",
    joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "user_id")}, //user_id에서 쓰는 이름(엔티티의 이름, 객체의 이름)이 (테이블 컬럼과) 같으면 굳이 referencedColumnName 를 쓸 필요가 없음 
    inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "authority_name")})
    private Set<Authority> authorities; // 권한은 세트임..!! 관리자의 경우에는 두 가지 다 가진다. 1 admin / 1 user // 중복 가능하다! // Set은 중복을 허용하지 않음 그래서 이런 경우에는 Set을 사용함
    // user_authority라는 테이블이 생성되고 authorities와 연결, authorities은 데이터베이스에 들어가지 않고(user Entity에만 있고 column이 아님) 데이터베이스를 가리킴
    // 한 사람당 각각의 종류에서(user나 admin) 하나씩 밖에 못가짐(ex) admin을 두 개 가지고 있을 수 없음.
	public User() {
		super();
	}

	public User(Long userId, String username, String password, String nickname, boolean activated,
			Set<Authority> authorities) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.nickname = nickname;
		this.activated = activated;
		this.authorities = authorities;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public Set<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Set<Authority> authorities) {
		this.authorities = authorities;
	}
    
}
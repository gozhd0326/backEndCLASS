package hj.securityproject.member.model;

import java.time.LocalDate;

import hj.securityproject.common.status.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

//대문자 Long은 class 이고 long은 원시타입임(가볍게 메소드에서 쓸 때), Long은 long을 관리하기 위해 만들어서 사용(Entity에서 사용)
@Entity //Entity에서는 기본생성자가 필수!!!!!
@Table(name = "member",
uniqueConstraints = {
		@UniqueConstraint(name = "uk_member_login_id", columnNames = {"loginId"})
}) // 유니크한 제한을 주겠다! 키의 이름은 "uk_member_login_id"(멤버 테이블의 유니크한 키, 설명은 로그인아이디 식으로 작명),그것을 받아오는 이름은 loginId"이다(변수).
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length=30, updatable = false) //database에서 절대 쓰이면 안될 것들을 기재(null을 허용하지 않고 글자수는 30이내, 업데이트는 안됨.(만들어지면 끝))
	private String loginId; //아이디에 준하는 유니크한 키를 지정해야됨. 중복은 허용하지 않음!!
	
	@Column(nullable = false, length=100)
	private String password;
	
	@Column(nullable = false, length=30)
	private String name;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE) // 날짜를 입력받을거야(타임은 시간이 찍힘)
	private LocalDate birthDate; //날짜를 입력받는 애
	
	@Column(nullable = false, length=5)
	@Enumerated(EnumType.STRING) //Enum이라는 것을 알려줌.(순서가 아니라 String이다)
	private Gender gender;
	
	@Column(nullable = false, length=30)
	private String email;

	public Member() {
		super();
	}

	public Member(Long id, String loginId, String password, String name, LocalDate birthDate, Gender gender,
			String email) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.password = password;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	} 
	
	
}

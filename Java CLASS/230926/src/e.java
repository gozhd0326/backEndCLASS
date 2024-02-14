import java.util.Scanner;
public class e {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	System.out.println("# 회원 가입 입력란 #");
	
	String name, gender, adress, phone, email;
	int age;
	
	System.out.print("이름 : ");
	name = s.next();
	
	System.out.print("성별 : ");
	gender = s.next();
	
	System.out.print("나이 : ");
	age = s.nextInt();
	
	s.nextLine();
	System.out.print("주소 : ");
	adress = s.nextLine();
	
//	s.nextLine();
	System.out.print("연락처 : ");
	phone = s.nextLine();

	System.out.print("이메일 : ");
	email = s.next();
	
	
	System.out.println("##회원가입 확인창##");
	
	System.out.println("이름 : " + name);
	System.out.println("성별 : " + gender);
	System.out.println("나이 : " + age);
	System.out.println("주소 : " + adress);
	System.out.println("연락처 : " + phone);
	System.out.println("이메일 : " + email);
	
	s.close();
}
}

package test4;

import java.util.Scanner;
public class class105 {
public static void main(String[]args){
	Scanner S = new Scanner(System.in);

String id;
System.out.print("아이디 : ");
id = S.next();

String pw;
System.out.print("비밀번호 : ");
pw = S.next();

String pwre;
System.out.print("비밀번호 확인 : ");
pwre = S.next();


String name;
System.out.print("이름 : ");
name = S.next();

String gender;
System.out.print("성별 : ");
gender = S.next();

String number;
System.out.print("전화번호 : ");
number = S.next();

String email;
System.out.print("이메일 : ");
email = S.next();

String intro;
System.out.print("자기소개 : ");
intro = S.next();

System.out.println("- 아이디 : " + id);
System.out.println("- 비밀번호 : "+pw);
System.out.println("- 비밀번호 확인 : " + pwre);
System.out.println("- 이름 : " + name);
System.out.println(" - 성별 : " + gender);
System.out.println(" - 전화번호 : " + number);
System.out.println("- 이메일 : " +email);
System.out.println("- 자기소개 : "+ intro);

S.close();
}
}
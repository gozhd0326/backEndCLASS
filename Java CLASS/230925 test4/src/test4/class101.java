package test4;

import java.util.Scanner;

public class class101 {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	int num1;
	System.out.print("정수를 입력하세요:");
	num1 = s.nextInt();
	System.out.println("사용자가 입력한 값 ==>"+num1);
	
	double num2;
	
	System.out.print("실수를 입력하세요:");
	num2 = s.nextDouble();
	System.out.println("사용자가 입력한 값 ==>"+num2);
	
	String str;
	System.out.print("뮨자열을 입력하세요 :");
	str = s.next();
	System.out.println("사용자가 입력한 값 ==>"+str);
	
	s.close();
}
}

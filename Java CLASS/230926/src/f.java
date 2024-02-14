import java.util.Scanner;
public class f {
public static void main(String[]args) {
Scanner s = new Scanner(System.in);
	
	int n1, n2, res;
	
	n1 = 102;
	n2 = 12;	
	res = n1 + n2;
	
	System.out.println(res);
	
	double n3, n4, res2;
	System.out.print("곱셈에 사용할 정수 혹은 실수를 입력해주세요. => ");
	n3 = s.nextDouble();
	System.out.print("곱셈에 사용할 정수 혹은 실수를 입력해주세요. => ");
	n4 = s.nextDouble();
	res2 = n3 * n4;
	
	int n5, n6, res3;
	System.out.print("뺄셈에 사용할 정수 혹은 실수를 입력해주세요. => ");
	n5 = s.nextInt();
	System.out.print("뺄셈에 정수 혹은 실수를 입력해주세요. => ");
	n6 = s.nextInt();
	res3 = n5 - n6;
	
	
	double n7, n8, res4;
	System.out.print("나눗셈에 사용할 정수 혹은 실수를 입력해주세요. => ");
	n7 = s.nextDouble();
	System.out.print("나눗셈에 사용할 정수 혹은 실수를 입력해주세요. => ");
	n8 = s.nextDouble();
	res4 = n7 / n8;

	
	int n9, n10, res5;
	System.out.print("나머지 값을 계산하기 위한 정수 혹은 실수를 입력해주세요. => ");
	n9 = s.nextInt();
	System.out.print("나머지 값을 계산하기 위한 정수 혹은 실수를 입력해주세요. => ");
	n10 = s.nextInt();
	res5 = n9 % n10;
	
	System.out.println("곱셈" + " : "+res2 + " = " + n3 +" * " + n4);
	System.out.println("뺄셈" + ":" + res3 + " = " + n5 + " - " + n6);
	System.out.println("나눗셈" + " : " + res4 + " = " + n7 + " / " + n8);
	System.out.println("나머지" + " : " + res5 + " = " + n9 + " % " + n10);
	
	
	s.close();
	
	
	
}
}

import java.util.Scanner;
public class b {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	
	int num;
	
	num = s.nextInt();
	System.out.println("사용자가 입력한 값 ==> " + num);
	
	double num2;
	System.out.println("실수를 입력하세요 : ");
	num2 = s.nextDouble();
	System.out.println("사용자가 입력한 값 ==>" + num2);
	
	String str;
	System.out.println("문자열을 입력하세요 :");
	str = s.next();
	System.out.println("사용자가 입력한 값 ==>" + str);
	
	
	s.close();
}
}

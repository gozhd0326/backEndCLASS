import java.util.Scanner;
public class class2 {
public static void main(String[]args) {
Scanner s = new Scanner(System.in);
	boolean bool1, bool2;
	bool1 = true;
	System.out.println(bool1);
	
	bool2 = (100<10);
	System.out.println(bool2);
	
//	int bool3;	
//	boolean bool4;
//	System.out.print("정수를 입력해주세요 : ");
//	bool3 = s.nextInt();
//	bool4 = (bool3>10);
//	System.out.println(bool4);
	
	int bool5;
	int bool6;
	boolean bool7;
	System.out.print("정수를 입력해주세요 : ");
	bool5 = s.nextInt();
	System.out.print("정수를 입력해주세요 : ");
	bool6 = s.nextInt();
	
	bool7 = (bool5<bool6);
	System.out.println(bool7);
	
	s.close();
}
}

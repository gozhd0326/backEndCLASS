import java.util.Scanner;
public class Code02_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num;

//		System.out.print("정수를 입력하세요 :");

		num = s.nextInt();
		System.out.println("사용자가 입력한 값 ==> " + num);		
		
		s.close();
	}
}
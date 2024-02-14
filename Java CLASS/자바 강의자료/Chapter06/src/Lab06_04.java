import java.util.Scanner;
public class Lab06_04 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int computer, user;
		
		for(int i=1; i<=10; i++) {
			computer = (int)(Math.random()*5 + 1);
			System.out.printf("게임 %d 회:", i);
			System.out.printf("컴퓨터가 생각한 숫자는 ? ");
			user = s.nextInt();
			
		    if (computer == user) {
		        System.out.println(" 맞혔네요. 축하합니다 !! ");
		        break;
		    } else {
		        System.out.printf(" 아까워요. %d 였는데요.  다시 해보세요. ㅠ\n" , computer);
		        continue;
		    }
		}
		
		System.out.println("게임을 마칩니다." );
		s.close();
	}
}

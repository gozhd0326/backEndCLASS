import java.util.Scanner;
public class Ex03_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Turtle turtle = new Turtle();	
		int angle, distance;
		
		turtle.width(10);
		turtle.penColor("blue");		
		
		while(true) {
			
			System.out.print("거북이의 회전 각도 : ");
			angle = s.nextInt();
			System.out.print("거북이의 이동 거리 : ");
			distance = s.nextInt();
			
			turtle.right(angle);
			turtle.forward(distance);
			
		}			
	}
}

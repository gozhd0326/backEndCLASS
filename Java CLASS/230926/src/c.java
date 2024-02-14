import java.util.Scanner;

public class c {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	System.out.println("## 택배 보내기 입니다. 다음을 각각 입력하세요. ##");
	
	String a, b;
	
	System.out.print("받는 사람 :");
	a = s.nextLine();
	
	System.out.print("주소 : ");
	b = s.nextLine();
	
	double c;
	System.out.print("무게 : ");
	c = s.nextDouble();

	System.out.println("받는 사람 :" + a);
	System.out.println("주소 : "+ b);
	System.out.println("무게(g) : "+ c);
	System.out.println("택배는 g당 5원이 부과됩니다");
	System.out.println("배송비 : " +c * 5 + "원");
	
	s.close();
	
}
}

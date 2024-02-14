import java.util.Scanner;
public class c2 {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("@ 우편 배송 정보란 @");
	System.out.println("g당 100원씩 부과됩니다.");
	
	String name, from, adress;
	double weight;
	
	
	System.out.print("받는 사람 ==> ");
	name = s.next();
	
	s.nextLine();
	System.out.print("보내는 사람 ==> ");
	from = s.nextLine();
	
	System.out.print("주소 ==> ");
	adress = s.nextLine();
	
	System.out.print("우편물 무게 ==> ");
	weight = s.nextDouble();
	
	
	
	System.out.println("입력란 확인");
	
	System.out.println("받는 사람 : " + name);
	System.out.println("보내는 사람 : " +from);
	System.out.println("주소 : " + adress);
	System.out.println("우편물 무게 : " + weight +"g");
	System.out.println("가격 : " + weight*100 + "원" );
	
	s.close();
	
}
}

import java.util.Scanner;
public class store {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);

System.out.println("- 캔커피 구입 및 판매내역 관리 -");	
int coffee1, coffee2, buy1, sell1, total_buy1, total_sell1;
coffee1 = 500;
coffee2 = 1800;
System.out.print(" 캔커피 구매량을 입력해주세요 : ");
buy1 = s.nextInt();
System.out.print(" 캔커피 판매량을 입력해주세요 : ");
sell1 = s.nextInt();
total_buy1 = coffee1 * buy1;
total_sell1 = coffee2 * sell1;

System.out.println("총 구매액(캔커피) : " + total_buy1 + "원");
System.out.println("총 판매액 (캔커피) : " + total_sell1 + "원" );
System.out.println("순이익(캔커피) : " + (total_sell1 - total_buy1) + "원");

System.out.println("- 삼각김밥 구입 및 판매내역 관리 -");	
int gimbab1, gimbab2, buy2, sell2, total_buy2, total_sell2;
gimbab1 = 900;
gimbab2 = 1400;
System.out.print(" 삼각김밥 구매량을 입력해주세요 : ");
buy2 = s.nextInt();
System.out.print(" 삼각김밥 판매량을 입력해주세요 : ");
sell2 = s.nextInt();
total_buy2 = gimbab1 * buy2;
total_sell2 = gimbab2 * sell2;

System.out.println("총 구매액(삼각김밥) : " + total_buy2 + "원");
System.out.println("총 판매액 (삼각김밥) : " + total_sell2 + "원" );
System.out.println("순이익(삼각김밥) : " + (total_sell2 - total_buy2) + "원");

s.close();
}
}

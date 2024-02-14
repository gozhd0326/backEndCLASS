import java.util.Scanner;
public class i {
public static void main(String[]args) {
	Scanner s = new Scanner (System.in);
//	int c1 = 500;
//	int c2 = 1800;
//	
//System.out.println("캔 커피 1800원 5개 판매");
//System.out.println("순수익 : " + (c2*5-c1*5));

System.out.println("# 총 매출액 계산 #");

int coffee1 = 500;
int coffee2 = 1800;
int buy1, total_buy1;
System.out.print("캔커피 구입량을 입력해주세요 : ");
buy1 = s.nextInt();

total_buy1 = coffee1 * buy1;
int sell1, total_sell1, total_sell2;
System.out.print("캔커피 판매량을 입력해주세요 : ");
sell1 = s.nextInt();
total_sell1 = coffee1 * sell1;
total_sell2 = coffee2 * sell1;

int totalPrice1 = total_sell2 - total_sell1 - total_buy1;

System.out.println("캔커피(900원) "+ sell1 +" 개 구입" + " = " + total_buy1 + "원");
System.out.println("캔커피(1800원) "+ sell1 +" 개 판매" + " = " + total_sell2 + "원");
System.out.println("순수익 : "+ totalPrice1+ "원" );

int gimbab1 = 900;
int gimbab2 = 1400;

int buy2, total_buy2;
System.out.print("삼각김밥 구입량을 입력해주세요 : ");
buy2 = s.nextInt();
total_buy2 = gimbab1 * buy2;

int sell2, total_sell3, total_sell4;
System.out.print("삼각김밥 판매량을 입력해주세요 : ");
sell2 = s.nextInt();
total_sell3 = gimbab1 * sell2;
total_sell4 = gimbab2 * sell2;

int totalPrice2 = total_sell4 - total_sell3 - total_buy2;

System.out.print("삼각김밥(900원) " + buy2 + " 개 구입" + " = "+ total_buy2 + "원" );
System.out.println("삼각김밥(1400원 "+ sell2 +" 개 판매" + " = " + total_sell4 + "원");
System.out.println("순수익 : "+ totalPrice2 + "원" );

int milk1 = 800;
int milk2 = 1800;
int buy3, total_buy3;
System.out.print("바나나맛 우유 구입량을 입력해주세요 : ");
buy3 = s.nextInt();
total_buy3 = milk1 * buy3;

int sell3, total_sell5, total_sell6;
System.out.println("바나나맛 우유 판매량을 입력해주세요 : ");
sell3 = s.nextInt();
total_sell5 = milk1 * sell3;
total_sell6 = milk2 * sell3;

int totalPrice3 = total_sell6 - total_sell5 - total_buy3;

System.out.print("바나나맛 우유(800원) " + buy3 + " 개 구입" + " = "+ total_buy3 + "원" );
System.out.println("바나나맛 우유(1800원) " + sell3 + "개 판매" + total_sell6 + "원");
System.out.println("순수익 : " +  totalPrice3 + "원");

int pack1 = 3500;
int pack2 = 4000;
int buy4, total_buy4;
System.out.println("도시락 구입량을 입력해주세요 : ");
buy4 = s.nextInt();
total_buy4 = pack1 * buy4;


int sell4;
System.out.println("도시락 판매량을 입력해주세요 : ");
sell4 = s.nextInt();
int total_sell7, total_sell8;
total_sell7 = pack1 * sell4;
total_sell8 = pack2 * sell4;

int totalPrice4 = total_sell8 - total_sell7 - total_buy4;

System.out.println("도시락(3500원) " + buy4 + "개 구입" + total_buy4 + "원");
System.out.println("도시락(4000원) " + sell4 + "개 판매" + total_sell8 + "원");
System.out.println("순수익 : " + totalPrice4 + "원");


int coke1 = 700;
int coke2 = 1500;
int buy5, total_buy5;
System.out.print("구입량을 입력해주세요 : ");
buy5 = s.nextInt();
total_buy5 = coke1 * buy5;

int sell5, total_sell9, total_sell10;
System.out.println("판매량을 입력해주세요 : ");
sell5 = s.nextInt();
total_sell9 = coke1 * sell5;
total_sell10 = coke2 * sell5;

int totalPrice5 = total_sell10 - total_sell9 - total_buy5;

System.out.println("콜라(1500원) " + sell5 + "개 판매" + total_sell10 + "원");
System.out.println("순수익 : " + totalPrice5 + "원");

int snack1 = 1000;
int snack2 = 2000;

int buy6, total_buy6;
System.out.println("구입량을 입력해주세요 : ");
buy6 = s.nextInt();
total_buy6 = snack1 * buy6;

int sell6, total_sell11, total_sell12;
System.out.println("판매량을 입력해주세요 : ");
sell6 = s.nextInt();
total_sell11 = snack1 * sell6;
total_sell12 = snack2 * sell6;

int totalPrice6 = total_sell12 - total_sell11 - total_buy6; 

System.out.println("과자(2000원) " + sell6 + "개 판매" + total_sell12 + "원");
System.out.println("순수익 : " + totalPrice6 + "원");

System.out.println("오눌 총 매출액은" + (totalPrice1 + totalPrice2 + totalPrice3 +totalPrice4 + totalPrice5+ totalPrice6)+" 원 입니다.");


s.close();
}
}

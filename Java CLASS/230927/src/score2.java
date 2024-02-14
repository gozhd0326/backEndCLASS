import java.util.Scanner;
public class score2 {
public static void main(String[]args) {
Scanner s = new Scanner(System.in);

//int num1 = 99;
//
//System.out.println((num1 > 100) && (num1 < 200));
//System.out.println((num1 == 99) || (num1 == 100));
//System.out.println(!(num1 == 100));

//int num2;
//System.out.print("점수를 입력해주세요 : ");
//num2 = s.nextInt();
//
//System.out.println((num2 > 90) && (num2 < 101));
//System.out.println((num2 == 99) || (num2 == 100));
//System.out.println(!(num2 < 50 ) || (num2 < 30));

System.out.println("학점 관리 시스템 입니다.");
int num3;
System.out.print("점수를 입력해주세요 : ");
num3 = s.nextInt();

if(num3 > 98 && num3 <= 100) {
	System.out.println("A");
	
}else if(num3 <= 98 && num3 >= 90){

	System.out.println("B");

} else if(num3 < 90 && num3 >= 70){
	
	System.out.println("C");
	
} else if(num3 < 70 && num3 >= 55 ){	
	System.out.println("D");
	
} else if(!(num3 >= 55)) {
	System.out.println("F");
}
s.close();
}}


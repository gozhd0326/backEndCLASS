package test4;

import java.util.Scanner;
public class Lab02_01 {
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);

		System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요. ##");
		String str;
		System.out.print("받는 사람 : ");
		str = s.next();
		

		String str1;
		System.out.print("주소 : ");
		str1 = s.next();
		

		int num;

		System.out.print("무게(g) : ");
		num = s.nextInt();
		
		int total;
		total = num * 1000;
	
		

		
		System.out.println("** 받는 사람 ==> "+str);
		System.out.println("** 주소 ==> " + str1);
		System.out.println("**무게(g) ==>"+ num);
		System.out.println("~ 1g당 1000원씩 부과됩니다. ~");
		System.out.println("**배송비 ==>"+ total +"원");
		
		
		s.close();
		
}
}

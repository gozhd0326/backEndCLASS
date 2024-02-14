import java.util.Scanner;
public class score3 {
public static void main(String[]args) {
Scanner s = new Scanner(System.in);
	//	int java = 3, mobile = 2, excel = 1;
//	
//	double A = 4.5, A0 = 4.0, B = 3.5;
//	
//	double avg;
//	avg = ((java*B) + (mobile*A0) + (excel*A)) / (java + mobile + excel);
//	
//	System.out.print(avg);

double java2, mobile2, excel2;

double A = 4.5, A0 = 4.0, B = 3.5;

System.out.print("java 학점을 입력해주세요 : ");
java2 = s.nextDouble();

System.out.print("mobile 학점을 입력해주세요 : ");
mobile2 = s.nextDouble();

System.out.print("excel 학점을 입력해주세요 : ");
excel2 = s.nextDouble();

double avg2;
avg2 = ((java2*A + mobile2*B + excel2*A0)/(java2 + mobile2 + excel2));
System.out.println(avg2);

s.close();
}
}

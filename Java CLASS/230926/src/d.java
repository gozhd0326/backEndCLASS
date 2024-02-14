import java.util.Scanner;
public class d {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	int i, i2;
	System.out.print("정수1을 입력하세요. : ");
	i = s.nextInt();
	System.out.print("정수2를 입력하세요. : ");
	i2 = s.nextInt();
	int resAdd;
	int resSub;
	int resMul;
	double resDiv;
	int resRem;
	
	resAdd = i + i2;
	resSub = i - i2;
	resMul = i * i2;
	resDiv = (double)i / i2;
	resRem = i % i2;
	
	System.out.println(i + " + " + i2 + " = " + resAdd );
	System.out.println(i + " - " + i2 + " = " + resSub);
	System.out.println(i + " * " + i2 + " = " + resMul);
	System.out.println(i + " / " + i2 + " = " + resDiv);
	System.out.println(i + " % " +i2 + " = " + resRem);
	
	s.close();
}

}

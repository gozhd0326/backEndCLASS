
public class class1 {
public static void main(String[]args){
//	int var1 = 100.0; // type error가 발생 // double형을 int형으로 mismatch;
	double var2 = 100.0;
	System.out.printf("200+300");//print
	System.out.println();
	System.out.printf("%d", 200+300); //"%d" 계산한 값을 출력하기위함
	System.out.println();
//	System.out.print(200+300);
//	System.out.printf("%d %d", 200);//error 발생 :Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%d'
//	System.out.printf("%d %d", 200,300);
//	System.out.printf("%d,%d", 200,300);
//	System.out.printf("%d / %d = %d", 100, 200, 0.5);//error 발생 : Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%d'
	System.out.printf("%d / %d = %f", 100, 200, 0.5);
	
}
}

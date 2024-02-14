import java.util.Scanner;
public class h {
public static void main(String[]args) {
Scanner S = new Scanner(System.in);

double cm, in;

System.out.print("센티미터(cm)를 입력하세요 : ");
cm = S.nextDouble();

System.out.print("인치(in)를 입력하세요 : ");
in = S.nextDouble();


System.out.println("센티미터(cm)는 " + cm * 0.393701 + "인치(in) 입니다." );
System.out.print("인치(in)는 " + in * 2.54 + "센티미터(cm) 입니다.");

S.close();
}
}

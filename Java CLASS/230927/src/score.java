import java.util.Scanner;
public class score {
public static void main(String[]args) {
Scanner s = new Scanner(System.in);

System.out.println("시험 합격 여부");
int score;
System.out.print("시험 점수를 입력하세요 : ");
score = s.nextInt();

if(score>=70) {
	System.out.print("축하합니다!합격입니다!!");
}else {
	System.out.print("아쉽지만 불합격입니다.");
}

//System.out.print("시험점수가 70점 이상인가요? "+ (score>=70));



s.close();
}
}

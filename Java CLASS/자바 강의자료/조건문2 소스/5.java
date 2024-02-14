import java.util.Scanner;
 
public class ex05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("학년과 점수를 입력: ");
        int grade = sc.nextInt();
        int score = sc.nextInt();
        
        String msg = "잘못 입력하셨습니다.";
        if (0 <= score && score <= 100) {
            if (60 <= score ) {
                if (grade != 4) {
                    // 1~3학년, 60점 이상
                    msg = "합격입니다.";
                } else if (score >= 70) {
                    // 4학년, 70점 이상
                    msg = "합격입니다.";
                } else {
                    // 4학년, 70점 미만 
                    msg = "불합격입니다.";
                }
            } else {
                msg = "불합격입니다.";
            }
        }
        System.out.println(msg);
 
    }
}

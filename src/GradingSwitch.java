//switch문을 사용하여 학점 프로그램 작성
import java.util.Scanner;

public class GradingSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("성적 입력(0~100): ");
        int score = scanner.nextInt();
        char grade;

        switch (score/10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.print("학점은 " +grade+ "입니다.");
        scanner.close();
    }

}

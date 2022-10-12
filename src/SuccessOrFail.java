//시험 점수가 80점 이상이면 합격 판별하는 프로그램 작성
import java.util.Scanner;

public class SuccessOrFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();
        if (score >= 80)
            System.out.print("합격입니다!");
        else
            System.out.print("불합격입니다.");

        scanner.close();
    }
}

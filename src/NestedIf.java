//점수와 학년을 입력받아 60점 이상이면 합격, 미만이면 불합격 출력
//4학년의 경우 70점 이상이면 합격
import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();

        System.out.print("학년을 입력하세요(1~4): ");
        int grade = scanner.nextInt();

        if (grade != 4) {
            if (score >= 60)
                System.out.print("합격입니다!");
            else
                System.out.print("불합격입니다.");
        }
        else {
            if (score >= 70)
                System.out.print("합격입니다!");
            else
                System.out.print("불합격입니다.");
        }

    }
}

//다중 if-else문을 이용하여 입력받은 성적에 대해 학점 부여하는 프로그램 작성
import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("성적 입력(0~100): ");
        int score = scanner.nextInt();
        char grade;

        if(score>=90)
            grade = 'A';
        else if (score>=80)
            grade = 'B';
        else if (score>=70)
            grade = 'C';
        else if (score>=60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("학점은 " +grade+ "입니다.");

        scanner.close();
    }
}

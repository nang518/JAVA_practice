//입력된 수가 3의 배수인지 판별하는 프로그램 작성
import java.util.Scanner;
public class MultipleOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        int num = scanner.nextInt();

        if (num%3 == 0)
            System.out.println(num+ "은 3의 배수입니다.");
        else
            System.out.print(num+ "은 3의 배수가 아닙니다.");

        scanner.close();
    }
}

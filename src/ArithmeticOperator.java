//초 단위의 정수를 입력받고, 몇 시간, 몇 분, 몇 초인지 출력하는 프로그램 작성
import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("초 단위의 정수 입력: ");
        int time = scanner.nextInt();
        int second = time % 60;
        int minute = (time/60) % 60;
        int hour = (time/60) / 60;

        System.out.print(time+ "초는 " +hour+ "시간 " +minute+ "분 " +second+ "초입니다.");

        scanner.close();
    }
}

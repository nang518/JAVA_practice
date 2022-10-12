//-1이 입력될 때까지 입력된 수의 평균 구하기
import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0, sum = 0;
        System.out.print("합을 구할 정수를 입력하고 마지막에 -1을 입력하세요: ");

        int n = scanner.nextInt();
        while (n!=-1) {
            count++;
            sum += n;
            n = scanner.nextInt();
        }
        if (count == 0) System.out.print("입력된 수가 없습니다.");
        else {
            System.out.print("정수의 개수는 " +count+ "개이고, 평균은 " +(double)sum/count+ "입니다.");
        }
        scanner.close();
    }
}

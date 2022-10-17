//3개의 정수를 입력받아 합을 구하는 프로그램 작성
import java.util.*;
public class InputException {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하세요: ");
        int n=0, sum=0;
        for(int i=0; i<3; i++) {
            System.out.print(i+ ">> ");
            try {
                n = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("정수가 아닙니다.");
                scanner.next();
                i--;
                continue;
            }
            sum += n;
        }
        System.out.println("합은 "+sum);
        scanner.close();
    }
}

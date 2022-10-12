//"exit"이 입력되면 while문을 벗어나도록 break문 활용하는 프로그램 작성
import java.util.Scanner;

public class BreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("exit를 입력하면 종료합니다.");
        while(true) {
            System.out.print(">>");
            String text = scanner.next();
            if(text.equals("exit"))
                break;
        }
        System.out.print("프로그램을 종료합니다.");

        scanner.close();
    }
}
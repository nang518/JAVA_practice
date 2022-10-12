//Scanner를 이용하여 이름, 도시, 나이, 체중, 독신 여부를 입력 받고 다시 출력하는 프로그램 작성
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름, 도시, 나이, 체중, 독신 여부를 공백으로 분리하여 입력: ");

        String name = scanner.next();
        System.out.print("이름은 " +name+ ", ");

        String city = scanner.next();
        System.out.print("도시는 " +city+ ", ");

        int age = scanner.nextInt();
        System.out.print("나이는 " +age+ "살, ");

        double weight = scanner.nextDouble();
        System.out.print("체중은 " +weight+ "kg, ");

        boolean single = scanner.nextBoolean();
        System.out.println("독신 여부는 " +single+ "입니다.");

        scanner.close();
    }
}

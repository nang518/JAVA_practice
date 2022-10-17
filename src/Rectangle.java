//너비와 높이를 입력받아 사각형의 합을 출력하는 프로그램 작성
import java.util.Scanner;

public class Rectangle {
    double width, height;

    public double getArea() {
        return width * height;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Rectangle rect = new Rectangle();
        System.out.print(">> ");

        rect.width = scanner.nextDouble();
        rect.height = scanner.nextDouble();

        System.out.print("사각형의 면적은 " +rect.getArea());

        scanner.close();
    }
}
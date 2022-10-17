//배열의 length 필드를 이용하여 배열 크기만큼 정수를 입력 받고 평균을 구하는 프로그램 작성
import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        int intArray[] = new int[n];
        int sum = 0;

        System.out.println(intArray.length+ "개의 정수를 입력하세요.");
        for(int i=0; i< intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            sum += intArray[i];
        }
        System.out.print("평균은 " +(double)(sum/intArray.length));

        scanner.close();
    }
}

//Book 클래스를 활용하여 2개짜리 Book 객체 배열을 만들고, 사용자로부터 책의 제목과 저자를 입력받아 배열 완성하는 프로그램 작성
import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] book = new Book[2];

        for(int i=0; i<book.length; i++) {
            System.out.print("제목>> ");
            String title = scanner.nextLine();
            System.out.print("저자>> ");
            String author = scanner.nextLine();
            book[i] = new Book(title,author);
        }

        for(int i =0; i<book.length; i++) {
            System.out.print("(" +book[i].title+ ", " +book[i].author+ ")");
        }
        scanner.close();
    }
}

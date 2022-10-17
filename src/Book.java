//제목과 저자를 나타내는 title과 author 필드를 가진 Book 클래스를 작성하고, 생성자를 작성하여 필드 초기화
public class Book {
    String title, author;

    void show() {System.out.println(title+ " " +author); }

    public Book() {
        this("", "");
        System.out.println("생성자 호출됨");
    }

    public Book(String title) {
        this(title, "작자미상");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args){
        Book littlePrince = new Book("어린왕자","생텍쥐페리");
        Book loveStory = new Book("춘향전");
        Book emptyBook = new Book();
        loveStory.show();
    }
}

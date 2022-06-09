/*
Grade 클래스를 작성해보자. 3과목의 점수를 입력받아 Grade 객체를 생성하고 성적평균을 출력하는 main()과 실행 예시 참고.
Grade 클래스에 int 타입의 math, science, english 필드를 private로 선언하고, 생성자와 세 과목의 평균을 리턴하는 average() 메소드 작성
>>수학, 과학,영어 순으로 3개의 점수 입력>> __ __ __
평균은 __
 */
import java.util.Scanner;

class Grade
{
    private int math, science, english;
    Grade(int math, int science, int english)
    {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    int average()
    {
        return (math+science+english)/3;
    }
}

public class GradeClassEx {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();

        Grade me = new Grade(math,science,english);
        System.out.println("평균은 " +me.average());

        scanner.close();
    }
}

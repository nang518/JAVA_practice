//반지름이 0~4인 객체 5개를 가지는 배열을 생성하고, 배열에 있는 모든 Circle 객체의 면적 출력하는 프로그램 작성
public class CircleArray {
    public static void main(String[] args) {
        Circle c[] = new Circle[5];

        for(int i=0; i<c.length; i++)
            c[i] = new Circle(i); //i번째 원소 객체 생성

        for(int i=0; i<c.length; i++)
            System.out.print((int)(c[i].getArea())+" ");
    }
}

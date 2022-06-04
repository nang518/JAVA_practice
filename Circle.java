//반지름과 이름을 가진 Circle 클래스를 작성하고, Circle 클래스의 객체 생성
public class Circle {
    int radius;
    String name;
    final double PI = 3.14;

    public double getArea()
    {
        return PI * radius * radius;
    }

    public static void main(String[] args)
    {
        Circle pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "피자";
        double area = pizza.getArea();
        System.out.println(pizza.name+ "의 면적은 " +area);

        Circle donut = new Circle();
        donut.name = "도넛";
        donut.radius = 2;
        area = donut.getArea();
        System.out.println(donut.name+ "의 면적은 " +area);
    }
}

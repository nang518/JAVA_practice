//반지름과 이름을 가진 Circle 클래스를 생성하고, Circle 클래스의 객체를 생성.
public class Circle {
    int radius;
    String name;

    public Circle() {
        radius = 1;
        name = "";
    }
    public Circle(int r, String n) {
        radius = r;
        name = n;
    }
    public Circle(int radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");

        double area = pizza.getArea();
        System.out.println(pizza.name+ "의 면적은 " +area);

        Circle donut = new Circle();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.print(donut.name+ "의 면적은 " +area);
    }
}
//super()를 이용하여 ColorPoint 클래스의 생성자에서 슈퍼클래스 Point의 생성자를 호출
//출력예시 >> blue(5,6)
class Point
{
    private int x,y;
    public Point()
    {
        this.x = this.y = 0;
    }
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public void showPoint()
    {
        System.out.println("("+x+","+y+")");
    }
}
class ColorPoint extends Point
{
    private String color;
    public ColorPoint(int x, int y, String color)
    {
        super(x,y);
        this.color = color;
    }
    public void showColorPoint()
    {
        System.out.print(color);
        showPoint();
    }
}
public class SuperEx {
    public static void main(String[] args)
    {
        ColorPoint cp = new ColorPoint(5,6,"Blue");
        cp.showColorPoint();
    }
}

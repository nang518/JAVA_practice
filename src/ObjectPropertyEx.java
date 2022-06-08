//객체 레퍼런스만으로 객체 클래스명, 해시코드 값, 객체 문자열 출력
class Point
{
    int x,y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
public class ObjectPropertyEx {
    public static void print(Object obj)
    {
        System.out.println(obj.getClass().getName());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        System.out.println(obj);
    }
    public static void main(String[] args)
    {
        Point p = new Point(2,3);
        print(p);
    }
}

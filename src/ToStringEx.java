//Point 클래스에 Point 객체를 문자열로 리턴하는 toString() 메소드 작성
class Point
{
    int x,y;
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return "Point("+x+","+y+")";
    }
}
public class ToStringEx {
    public static void main(String[] args)
    {
        Point p = new Point(2,3);
        System.out.println(p.toString());
        System.out.println(p);
        System.out.println(p+"입니다.");
    }
}

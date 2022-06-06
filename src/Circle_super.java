class Shape
{
    protected String name;
    public void paint()
    {
        draw();
    }
    public void draw()
    {
        System.out.println(name);
    }
}

public class Circle_super extends Shape {
    protected String name;
    public void draw()
    {
        name = "Circle";
        super.name = "Shape";
        super.draw();
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        Shape b = new Circle_super();
        b.paint();
    }
}
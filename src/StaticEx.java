public class StaticEx {
    public static void main(String[] args) {
        Ex.m = 10;

        Ex s1 = new Ex();
        System.out.println(s1.m);
        s1.f();
        Ex.f();
    }
}
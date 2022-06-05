//전역 함수로 작성하고자 하는 abs, max, min 3개 함수를 static 메소드로 작성하고 호출
class Calc {
    public static int abs(int a) {return a>0?a:-a;}
    public static int max(int a, int b) {return a>b?a:b;}
    public static int min(int a, int b) {return a<b?a:b;}
}
public class CalcEx {
    public static void main(String[] args)
    {
        System.out.println(Calc.abs(-5));
        System.out.println(Calc.max(56,10));
        System.out.println(Calc.min(-3,10));
    }
}

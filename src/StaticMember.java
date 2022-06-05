//static 멤버를 이용하여 달러와 원화를 변환 해주는 환율 계산기
import java.util.Scanner;

class CurrencyConverter {
    private static double rate; //원화에 대한 환율
    public static double toDollar(double won)
    {
        return won/rate;
    }
    public static double toKWR(double dollar)
    {
        return dollar * rate;
    }
    public static void setRate(double r)
    {
        rate = r;
    }
}

public class StaticMember {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double won=0, dollar=0;



        System.out.print("1. 원화 -> 달러 or 2. 달러 -> 원화 >> ");
        int choice = scanner.nextInt();

        System.out.print("환율($1)>> ");
        double rate = scanner.nextDouble();

        CurrencyConverter.setRate(rate); //달러 환율 설정

        if(choice == 1) {
            System.out.print("원화를 입력하세요: ");
            won = scanner.nextDouble();
            System.out.println(won+ "원은 $" +CurrencyConverter.toDollar(won)+ "입니다.");
        }
        else {
            System.out.print("달러를 입력하세요: ");
            dollar = scanner.nextDouble();
            System.out.println("$" +dollar+ "는 " +CurrencyConverter.toKWR(dollar)+ "원입니다.");
        }


    }

}

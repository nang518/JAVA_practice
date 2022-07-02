import java.util.*;
public class _2480 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int price;

        if((a==b)&&(a==c))
            price = 10000 + (a*1000);
        else if(a==b)
            price = 1000 + (a*100);
        else if(a==c)
            price = 1000 + (a*100);
        else if(b==c)
            price = 1000 + (b*100);
        else
        {
            int max = a;
            if(max<b)
                max = b;
            if(max<c)
                max = c;
            price = max * 100;
        }
        System.out.print(price);
    }
}
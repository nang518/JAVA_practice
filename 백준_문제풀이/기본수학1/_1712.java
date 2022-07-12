import java.util.*;
public class _1712 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(C<=B)
            System.out.print("-1");
        else
            System.out.print((A/(C-B))+1);
    }
}
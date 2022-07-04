import java.util.*;
public class _11720 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String a = scanner.next();
        int sum = 0;

        for(int i=0; i<N; i++)
        {
            sum += a.charAt(i)-'0';
        }
        System.out.print(sum);
    }
}
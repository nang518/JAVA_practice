import java.util.*;
public class _2577 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int T = A * B * C;
        int count[] = new int[10];
        while(T>0)
        {
            count[T%10]++;
            T/=10;
        }
        for(int i=0; i<count.length; i++)
        {
            System.out.println(count[i]);
        }
    }
}
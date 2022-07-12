import java.util.*;
public class _2292 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cnt = 1;
        int range = 2;

        if(N==1)
            System.out.print(1);
        else
        {
            while(range <= N)
            {
                range = range + (6*cnt);
                cnt++;
            }
            System.out.print(cnt);
        }
    }
}
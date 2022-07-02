import java.util.*;
public class _1110 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cnt=0, num=N;
        while(true)
        {
            N = ((N%10)*10 + (N/10 + N%10)%10);
            cnt++;
            if(num == N)
                break;
        }
        System.out.print(cnt);
    }
}
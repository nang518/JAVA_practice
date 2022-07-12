import java.util.*;
public class _10750 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++)
        {
            int H = scanner.nextInt();
            int W = scanner.nextInt();
            int N = scanner.nextInt();

            if(N%H == 0)
            {
                //Y = H * 100;
                //X = N / H;
                System.out.println((H*100) + (N/H));
            }
            else
            {
                //Y = (N % H) * 100;
                //X = (N / H) + 1;
                System.out.println(((N%H)*100) + ((N/H)+1));
            }
        }
    }
}
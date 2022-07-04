import java.util.*;
public class _4344 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int arr[];
        int C = scanner.nextInt();

        for(int i=0; i<C; i++)
        {
            int N = scanner.nextInt();
            arr = new int[N];
            double sum = 0;

            for(int j=0; j<N; j++)
            {
                arr[j] = scanner.nextInt();
                sum += arr[j];
            }

            double mean = sum/N;
            double count = 0;

            for(int j=0; j<N; j++)
            {
                if(arr[j]>mean)
                    count++;
            }
            System.out.printf("%.3f%%\n",(count/N)*100);
        }
    }
}
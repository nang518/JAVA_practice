import java.util.*;
public class _1546 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        double num[] = new double[N];
        int M = 0;
        double sum=0;
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scanner.nextInt();
            if(M<arr[i])
                M = arr[i];
        }
        for(int i=0; i<arr.length; i++)
        {
            num[i] = (double) arr[i] / M * 100;
            sum += num[i];
        }
        System.out.print(sum/arr.length);
    }
}
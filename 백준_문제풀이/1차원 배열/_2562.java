import java.util.*;
public class _2562 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt=0, max=0;
        for(int i=1; i<10; i++)
        {
            arr[i] = scanner.nextInt();
            if(arr[i]>max)
            {
                max = arr[i];
                cnt = i;
            }
        }
        System.out.println(max);
        System.out.print(cnt);
    }
}
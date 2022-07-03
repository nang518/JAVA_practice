import java.util.*;
public class _3052 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt=0;
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = scanner.nextInt() %42;
        }
        for(int i=0; i<10; i++)
        {
            int temp=0;
            for(int j=i; j>=0; j--)
            {
                if(arr[i] != arr[j])
                    temp++;
            }
            if(temp == i)
                cnt++;
        }
        System.out.print(cnt);
    }
}
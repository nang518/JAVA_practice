import java.util.*;
public class _1157 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int arr[] = new int[26];
        int max = -1;
        char ch = '?';
        for (int i = 0; i < S.length(); i++)
        {
            if('A'<=S.charAt(i) && S.charAt(i)<='Z')
                arr[S.charAt(i)-'A']++;
            else
                arr[S.charAt(i)-'a']++;
        }

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                ch = (char)(i+65);
            }
            else if(arr[i]==max)
            {
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}
import java.util.*;
public class _1316 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        for(int i=0; i<N; i++)
        {
            boolean check[] = new boolean[26];
            boolean group = true;
            String S = scanner.next();

            for(int j=0; j<S.length(); j++)
            {
                int index = S.charAt(j) -'a';
                if(check[index])
                {
                    if(S.charAt(j) != S.charAt(j-1))
                    {
                        group = false;
                        break;
                    }
                }
                else
                    check[index] = true;
            }
            if(group)
                count++;
        }
        System.out.print(count);
    }
}
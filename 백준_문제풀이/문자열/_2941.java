import java.util.*;
public class _2941 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int count = 0;
        for(int i=0; i<S.length(); i++)
        {
            char ch = S.charAt(i);
            if(ch=='c')
            {
                if(i<S.length()-1)
                {
                    if(S.charAt(i+1)=='=')
                        i++;
                    else if(S.charAt(i+1)=='-')
                        i++;
                }
            }
            else if(ch=='d')
            {
                if(i<S.length()-1)
                {
                    if(S.charAt(i+1)=='z')
                    {
                        if(i<S.length()-2)
                        {
                            if(S.charAt(i+2)=='=')
                                i+=2;
                        }
                    }
                    else if(S.charAt(i+1)=='-')
                        i++;
                }
            }
            else if(ch=='l')
            {
                if(i<S.length()-1)
                {
                    if(S.charAt(i+1)=='j')
                        i++;
                }
            }
            else if(ch=='n')
            {
                if(i<S.length()-1)
                {
                    if(S.charAt(i+1)=='j')
                        i++;
                }
            }
            else if(ch=='s')
            {
                if(i<S.length()-1)
                {
                    if(S.charAt(i+1)=='=')
                        i++;
                }
            }
            else if(ch=='z')
            {
                if (i < S.length() - 1) {
                    if (S.charAt(i + 1) == '=')
                        i++;
                }
            }
            count++;
        }
        System.out.print(count);
    }
}
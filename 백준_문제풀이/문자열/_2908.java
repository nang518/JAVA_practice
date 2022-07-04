import java.util.*;
public class _2908 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();

        int reverseA = (A.charAt(2)-'0')*100 + (A.charAt(1)-'0')*10 + (A.charAt(0)-'0');
        int reverseB = (B.charAt(2)-'0')*100 + (B.charAt(1)-'0')*10 + (B.charAt(0)-'0');

        if(reverseA > reverseB)
            System.out.print(reverseA);
        else
            System.out.print(reverseB);
    }
}
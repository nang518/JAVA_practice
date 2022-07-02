import java.util.*;
public class _2525 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int T = (A*60) +B+C;
        A = T/60;
        B = T%60;

        if(A>23)
            A = A-24;
        System.out.print(A+" "+B);
    }
}
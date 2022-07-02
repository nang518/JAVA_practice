import java.util.*;
public class _10952 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int A= scanner.nextInt();
        int B= scanner.nextInt();

        while((A!=0) && (B!=0))
        {
            System.out.println(A+B);
            A = scanner.nextInt();
            B = scanner.nextInt();
        }
    }
}
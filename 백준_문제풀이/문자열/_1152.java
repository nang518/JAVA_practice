import java.util.*;
public class _1152 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();
        if(S.isEmpty())
            System.out.println(0);
        else
            System.out.println(S.split(" ").length);
    }
}
import java.util.*;
public class _1065 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(Arithmetic_Sequence(scanner.nextInt()));
    }

    public static int Arithmetic_Sequence(int num)
    {
        int cnt = 0;
        if(num<100)
            return num;
        else
        {
            cnt = 99;
            for(int i=100; i<=num; i++)
            {
                int hun = i / 100;
                int ten = (i/10)%10;
                int one = i%10;

                if((hun-ten)==(ten-one))
                    cnt++;
            }
        }
        return cnt;
    }
}
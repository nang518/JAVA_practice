//char[] 배열을 전달받아 출력하는 printCharArray() 메소드와 배열 속의 공백 문자를 ','로 대치하는 replaceSpace() 메소드 작성
public class ArrayParameterEx {
    static void replaceSpace(char a[]){
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == ' ')
                a[i] = ',';
        }
    }
    static void printCharArray(char a[]) {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        char c[] = {'B','i','r','t','h','d','a','y',' ','p','a','r','t','y'};
        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }
}

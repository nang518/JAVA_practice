//char[] 배열을 전달받아 출력하는 printCharArray()메소드와 배열 속의 공백 문자를 ,로 대치하는 replaceSpace() 메소드 작성
public class ArrayPassingEx {
    static void printCharArray(char a[]) {
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    static void replaceSpace(char a[]) {
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == ' ')
                a[i] = ',';
        }
    }

    public static void main(String[] args)
    {
        char c[] = {'오','늘','은',' ','금','요','일','이','야',' ','그','치','만',' ','시','험','이','야','.'};
        printCharArray(c);
        replaceSpace(c);
        printCharArray(c);
    }
}

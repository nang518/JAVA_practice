//2중 중첩을 사용한 구구단
public class NestedLoop {
    public static void main(String[] args) {
        for(int i=1; i<10; i++) {
            for(int j=2; j<10; j++) {
                System.out.print(j+ "x" +i+ "=" +i*j);
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
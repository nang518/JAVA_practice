//2차원 배열에 학년별로 1,2학기 성적을 저장하고, 4년간 전체 평점 평균 출력하는 프로그램 작성
import java.util.Scanner;

public class ScoreAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double score[][] = new double[4][2];

        int sum = 0;
        for(int i=0; i<score.length; i++){
            System.out.print((i+1)+ "학년 평점을 입력하세요(1학기, 2학기): ");
            for(int j=0; j<score[i].length; j++) {
                score[i][j] = scanner.nextDouble();
                sum += score[i][j];
            }
        }

        int total = score.length * score[0].length;
        System.out.print("전체 평점 평균은 " +(double)sum/total);

        scanner.close();
    }
}
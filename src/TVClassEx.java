/*
main() 메소드를 실행하였을 때 예시와 같이 출력되도록 TV클래스를 작성.
>> LG에서 만든 2017년형 32인치 TV
 */

class TV
{
    String company;
    int year;
    int inch;

    TV(String company, int year, int inch)
    {
        this.company = company;
        this.year = year;
        this.inch = inch;
    }

    public void show()
    {
        System.out.println(company+ "에서 만든 " +year+ "년 " +inch+ "인치");
    }
}
public class TVClassEx {
    public static void main(String[] args)
    {
        TV myTV = new TV("LG",2017,32);
        myTV.show();
    }
}

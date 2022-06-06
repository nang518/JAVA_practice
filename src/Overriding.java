//게임에서 무기를 표현하는 Weapon 클래스를 만들고 살상능력을 리턴하는 fire() 메소드 작성. fire()은 1 리턴
//대포를 구현하기 위해 Weapon을 상속받는 Cannon클래스 작성. Cannon은 살상능력 10. fire() 메소드를 이에 맞게 오버라이딩.
//main()을 작성하여 오버라이팅 테스트
class Weapon
{
    protected int fire()
    {
        return 1;
    }
}

class Cannon extends Weapon
{
    protected int fire()
    {
        return 10;
    }
}

public class Overriding {
    public static void main(String[] args)
    {
        Weapon weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은 "+weapon.fire());
        weapon = new Cannon();
        System.out.println("대포의 살상 능력은 " +weapon.fire());
    }
}

package ex07;

interface Remocon { // 메서드 강제
    void on(); // public abstract 생략이 가능하다

    void off();
} //인터페이스는 무조건 규칙을 먼저 만들어 주어서 강제시켜야한다.

//ex) 내가 컨테이너를 만들었으니 너희가 여기에 맞게 트럭 만들어!!
//인터페이스는 이세상에 존재하지 않아 오브젝트가 아님
//인터페이스는 메서드를 강제
//메서드는 무조건 이 인터페이스에 맞춰서(implements) 만들어야
class SamsungRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("삼성 리모건 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 off");
    }
}

class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("LG리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("LG리모컨 off");
    }
}

/**
 * 작성자 : 홍길동
 * 날짜(작성일) : 2023.12.26
 * 구현체 : SamsungRemocon, LgRemocon
 * 구현체가 적혀있지 않다면 쓸 수가 없다.
 */
class CommonRemocon {
    //[Remocon, SamsungRemocon]
    //[Remocon, LgRemocon]
    private Remocon r; // 인터페이스 or 추상클래스

    public CommonRemocon(Remocon r) {
        this.r = r;
    }

    public void on() {
        r.on(); //[Remocon, SamsungRemocon]
    }

    public void off() {
        r.off();
    }
}

public class InterEx01 {
    public static void main(String[] args) {
        CommonRemocon cr = new CommonRemocon(new SamsungRemocon()); //()안에 new Remocon()쓸 수없다. Remocon은 오브젝트(인터페이스 이기때문에)가 아니다 때문에 객체를 확인해야한다.
        cr.on();
        //        Remocon samsung = new SamsungRemocon(); // [Remocon , SamsungRemocon] 두개의 메모리가 뜬다.
        //        samsung.on(); //Remocon을 때리고 그 Remocon이 SamsungRemocon을 때리는 원리

    }
} //동적바인딩
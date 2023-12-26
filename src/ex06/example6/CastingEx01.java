package ex06.example6;


class Protoss {

}

class Zealot extends Protoss {
    public void attack() {
        System.out.println("질럿이 공격합니다.");
    }
}

class Dragoon extends Protoss {
    public void attack() {
        System.out.println("드라군이 공격합니다.");
    }
}

public class CastingEx01 {

    public static void start(Protoss p) {
        if (p instanceof Zealot) {                            //instanceof 타입검사
            Zealot u = (Zealot) p; // 부모를 자식에게 전달(대입)할 수 없다. --> 자식을 부모에게 전달 할 수 있다. protoss type이 zealot type보다 크니까 다운캐스팅(명시적 형변환)을 사용
            u.attack();
        }

        if (p instanceof Dragoon) {
            Dragoon u = (Dragoon) p;
            u.attack();
        }

    }

    public static void main(String[] args) {
        start(new Zealot());
        start(new Dragoon());
    }
}

//실행 시 오류 = 런타임 exception
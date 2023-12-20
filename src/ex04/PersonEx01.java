package ex04;

//설계도
class People {
    String name;
    int power;
    int hp;

    //alt + insert
    //shift + 방향키 - 블록씌우기
    //ctrl + e 최근 목록 띄우기
    // 객체 초기화
    public People(String name, int power) { //stack 자료 에서 heap 자료로 바꿔준다
        this.name = name;
        this.power = power;
        this.hp = 100;
    }

    // 행위
    public void upgradePower() {
        this.power++; //this는 heap거....
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    }
}

public class PersonEx01 { //객체 초기화 = 생성자 //시간이 변화한다 메서드
    public static void main(String[] args) {
        People p1 = new People("티모", 10);
        System.out.println(p1);

        p1.upgradePower();
        System.out.println(p1);
    }
}

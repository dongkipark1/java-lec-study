package ex06.example5;


abstract class 판사 { //object가 아니다 존재하지 않기 때문에
    public abstract void 심문();

}

abstract class 증인 { //독립적으로 띄울 수있는 방법은 없다
    public abstract void 대답(); //추상클래스
}


class 왕 extends 판사 {    //다형성
    public void 심문() {
        System.out.println("왕은 심문한다.");
    }
}

class 왕비 extends 판사 {   //다형성
    public void 심문() {
        System.out.println("왕비는 심문한다.");
    }
}

class 모자장수 extends 증인 {
    public void 대답() {
        System.out.println("모자장수는 대답한다.");
    }
}

class 토끼 extends 증인 {
    public void 대답() {
        System.out.println("토끼는 대답한다.");
    }
}

class 엘리스 extends 증인 {

    public void 대답() { // class 이름을 클릭한 후 Alt + enter 이름이 강제된다 다시말해 재정의를 강제한다.
        System.out.println("엘리스는 대답한다.");
    }
}

public class AliceApp {

    public static void main(String[] args) {
        판사 u1 = new 왕비(); //메모리 [판사,왕비]
        증인 u2 = new 엘리스(); //메모리 [증인,토끼]

        u1.심문();
        u2.대답();

    }
}

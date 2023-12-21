package ex05;

class President { //싱글톤 패턴

    static President instance = new President(); //main 시작전에 static이 붙으면 실행가능


    private President() {
    }
}

public class SingleTonEx01 {
    public static void main(String[] args) { //main 시작전 heap뜬다 그리고 그안에 President가 있고 그 주소값이 instance이다
        President p1 = President.instance; // instance 주소 가리킨다
        System.out.println(p1.hashCode());

        President p2 = President.instance;
        System.out.println(p2.hashCode());
    }
}

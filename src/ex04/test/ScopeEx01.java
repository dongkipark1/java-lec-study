package ex04.test;

public class ScopeEx01 { //ScopeEx01.m1 가능하기도 하고 ScopeEx01 생략 가능하다

    int n1 = 1;
    static int n2 = 2;

    static void m1() { //호출하기 전에는 메인 시작전 호출
        int n5 = 10;// 열리지 않는다
        System.out.println("m1: " + n5); //Queue의 크기 : 2
    }

    void m2() {
        System.out.println("m2: " + n1);
    }

    // 메인 시작 전 static에 n1변수와 m1 메서드가 로드되었음 안 떠있으면 부르지 못함
    public static void main(String[] args) {
        System.out.println(1);
        m1();
        System.out.println(2);
        ScopeEx01 sc = new ScopeEx01();
        System.out.println(sc.n1);
        sc.m2();
    }
}

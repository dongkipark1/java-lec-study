package ex04;

public class MethodEx01 { // 메서드는 호출 할때만 실행된다

    static void m1() { //void = 반환할게 없음..... 자판기에서 콜라가 안나옴
        System.out.println("m1"); // 기본 메서드
    }

    static String m2() {
        System.out.println("m2");
        return "m2"; // 메서드 종료 // 메서드 1개 반환 //
    }

    public static void main(String[] args) {
        m1();                                  //static에서는 class.명을 찾는데 class는 생략이 가능하다
        String result = m2();                  // m2 실행 시에 내부(10, 11번이 열림)가 열림  m1 실행시에는 6번이 열림
        System.out.println("result : " + result);
    }
} // 메서드의 기본

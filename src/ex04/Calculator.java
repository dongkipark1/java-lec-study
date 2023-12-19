package ex04;

//public int minus(int n3, int n4) // 모든 메서드는 class안에 만들어야 한다
//        return n3 - n4;
//계산기 클래스 = 설계도
public class Calculator { //static이 아니라 메모리(CalculatorApp)에 뜨지 않음
    public int add(int n1, int n2) {
        return n1 + n2;// main에 띄울 수 있는 메모리는 하나 뿐 //메서드 안에 메서드는 못만든다
    }

    public int minus(int n1, int n2) {
        return n1 - n2;
    }

    public int multi(int n1, int n2) {
        return n1 * n2;
    }

    public int devine(int n1, int n2) {
        return n1 / n2;
    }
}

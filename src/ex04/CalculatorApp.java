package ex04;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); //new를 붙여서 연결
        int result = cal.add(50, 80);
        int result2 = cal.minus(30, 15);
        int result3 = cal.multi(20, 50);
        int result4 = cal.devine(70, 5);

        System.out.println("더하기의 값은: " + result);
        System.out.println("빼기의 값은: " + result2);
        System.out.println("곱하기의 값은: " + result3);
        System.out.println("나누기의 값은: " + result4);

    }
}

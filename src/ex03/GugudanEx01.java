package ex03;

public class GugudanEx01 {
    public static void main(String[] args) {
        // 1. 2~9단 까지 출력되는 프로그램을 만드시오.
        // 2. 스캐너를 이용하여 입력받은 단만 출력하시오.
        // tip. 일단 2단부터 만들어봐라

        for (int i = 1; i <= 9 ; i++) {
            System.out.println(i + "단");
            for (int x = 2; x <= 9 ; x++) {
                System.out.println(i + "*" + x + "=" + (i * x) + "\t");
            }
        } System.out.println();
    }
}

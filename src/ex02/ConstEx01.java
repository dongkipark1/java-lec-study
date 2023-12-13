package ex02;

public class ConstEx01 {
    public static void main(String[] args) {
        int num = 1; // 변수
        final int sum = 10; // 상수(변하지 않는 값, 변경 불가능 READ ONLY 메모리) ex)혈액형
        num = 2;
        //sum = 20; // final int sum 때문에 오류가 남
    }
}

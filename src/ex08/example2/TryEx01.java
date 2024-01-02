package ex08.example2;


class Cal2 {
    //RuntimeException (엄마가 안알려줌)
    public void divide(int num) throws Exception { //checked exception (compile exception)
        System.out.println(10 / num);
    }

}

public class TryEx01 {
    public static void main(String[] args) {
        Cal2 c2 = new Cal2();
        try {
            c2.divide(0);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없어요");
        }
    }
} // 오류를 개발자에 위임함

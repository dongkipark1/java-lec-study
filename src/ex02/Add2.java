package ex02;

import java.util.Scanner;//util 이란 패키지 않에 Scanner란 class

public class Add2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x, y, sum;

        System.out.print("첫 번째 숫자를 입력하시오: "); // println 내려쓰기 print 이어쓰기
        x = sc.nextInt(); //이렇게 쓰면 값을 받을 수 있다(아직 불명확)

        System.out.print("두 번째 숫자를 입력하시오: ");
        y = sc.nextInt();

        sum = x+y;
        System.out.println(sum);
    }
}

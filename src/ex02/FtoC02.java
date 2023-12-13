package ex02;

import java.util.Scanner;

public class FtoC02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("화씨온도(F)를 입력하시오: ");

        //1. 화씨 온도 받기
        double f = sc.nextDouble();
        //System.out.println(f); (확인해보고 넘어가기 - 어디서 부터 오류가 났는지 확인하기 위해)

        //2. 화씨 --> 섭씨 변환
        double c = 5.0 / 9.0 * (f-32);
        System.out.println(c); // 여러 수를 넣어서 확인 절차를 거친다.


    }

}

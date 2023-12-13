package ex02;

import java.util.Scanner;

public class FtoC03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("섭씨온도(표준온도 C)를 입력하시오: ");

        //1. 섭씨 온도 받기
        double temp = sc.nextDouble();
        //System.out.println(C); // (확인해보고 넘어가기 - 어디서 부터 오류가 났는지 확인하기 위해)

        //2. 섭씨 --> 화씨 변환
        double result = 9.0 / 5.0 * temp + 32;
        System.out.println(result);
    }
}
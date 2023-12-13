package ex02;

import java.util.Scanner;

public class FtoC04 {
    public static void main(String[] args) {
        System.out.println("=============================");
        System.out.println("1. 화씨->섭씨");
        System.out.println("2. 섭씨->화씨");
        System.out.println("=============================");
        System.out.println();
        System.out.print("번호를 선택하시오: ");

        //1. 화씨 OR 섭씨 선택하는 로직
        Scanner sc = new Scanner(System.in);
        int selectedNum = sc.nextInt();

        //2. 화씨 혹은 섭씨 온도 받기
        System.out.println("온도를 입력하시오: ");
        double temp = sc.nextDouble();

        //3. 섭씨 --> 화씨 변환 혹은 화씨 --> 섭씨 변환
        double result = selectedNum == 1 ? 5.0 / 9.0 * (temp-32) : (9.0 / 5.0 * temp + 32);   //삼항(조건)연산자
        System.out.println("온도는: " +result);
    }
}
package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("화씨온도를 입력하세요");

        double f_temp = sc.nextDouble(); // 화씨 온도 입력 받기

        double c_temp = (f_temp - 32) * 5 / 9; // 화씨를 섭씨로 변환하는 공식

        System.out.println("섭씨온도는 " + c_temp);

        sc.close();
    }
}



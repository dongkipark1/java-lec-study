package ex03;

import java.util.Scanner;

public class NestedWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("정수를 입력하세요: "); // 여기서 부터 반복문 실행

            int number  =  sc.nextInt();

            if(number == 99){
                break;//웬만하면 break 사용하라
            }
            if(number > 0){
                System.out.println("양수");
            } else if (number < 0) {
                System.out.println("음수");
            }else {
                System.out.println("0");
            }
        }
    }
}

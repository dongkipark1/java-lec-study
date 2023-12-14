package ex03;

public class Multiple {
        public static void main(String[] args) {
            int sum = 0; // 합을 저장할 변수 초기화

            System.out.println("1부터 100 사이의 6의 배수:");
            for (int i = 1; i <= 100; i++) {
                if (i % 6 == 0) {
                    System.out.print(i + " ");
                    sum += i; // 6의 배수일 경우 합을 누적, sum = sum + i 와 같은 말
                }
            }

            System.out.println("\n6의 배수의 합: " + sum); // 합 출력
        }
}
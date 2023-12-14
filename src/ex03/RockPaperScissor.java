package ex03;

import java.util.Scanner;

public class RockPaperScissor {
    final int Scissor = 0;
    final int Rock = 1;
    final int Paper = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위(0), 바위(1), 보(2)");
        int user = sc.nextInt();

        int com = (int) (Math.random() * 3);
        if (user == com){
            System.out.println("플레이어와 컴퓨터가 비겼음");
        } else if (user == (com + 1) % 3) {
            System.out.println("플레이어: " + user + "컴퓨터: " + com + "   플레이어 승리");
        } else {
            System.out.println("플레이어: " + user + "컴퓨터: " + com + "   컴퓨터 승리");
        }
    }
}

package ex07;

import javax.swing.*;


public class MyFrameEx01 {

    static int num = 1;

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        //jf.setLayout(new BorderLayout());
        jf.setSize(300, 500); // 창의크기


        JButton btn1 = new JButton("더하기");
        JButton btn2 = new JButton("빼기");

        JLabel la1 = new JLabel(num + ""); //형변환 int > String

        jf.add("North", btn1);
        jf.add("South", btn2);
        jf.add("Center", la1);


        btn1.addActionListener(e -> { //람다에서는 타입 적지 않는다
            num++;
            la1.setText(num + "");
        });

        btn2.addActionListener(e -> {
            num--;
            if (num < 0) {
                num = 0;
            }
            la1.setText(num + "");
        });

        jf.setVisible(true);
    }
}

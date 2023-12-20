package ex04;


import javax.swing.*;

public class MyFrame {

    public static void main(String[] args) {
        JFrame jf = new JFrame("hello"); // heap에 띄움

        JButton btn1 = new JButton("클릭"); //생성자 오버로딩 되고 있음
        jf.add(btn1);

        btn1.addActionListener(e -> {
            System.out.println("버튼 클릭됨");
        });//btn1을 클릭하면 어떤 행위를 하는 것 >> 실행후 "버튼 클릭됨"이 실행됨 이것을 이벤트라고 한다.

        jf.setSize(300, 500); //setsize()를 키면 오버로딩 되는 것을 볼 수 있다
        jf.setVisible(true);
    }
}

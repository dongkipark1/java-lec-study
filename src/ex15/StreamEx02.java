package ex15;


import java.io.IOException;
import java.io.InputStreamReader;

//보조스트림 만들기
public class StreamEx02 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in); //ir은 키보드에 연결되어 있다
        char[] ch = new char[4]; //보조스트림

        try {
            ir.read(ch); //ir은 ch 보조스트림으로 부터 읽는다

            for (char c : ch) {
                System.out.print(c + " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

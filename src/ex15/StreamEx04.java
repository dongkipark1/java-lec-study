package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(System.out)); // <->InputStreamReader
        try {
            bw.write("안녕\n"); // \n을 하면 엔터가 된다
            bw.write("반가워\n"); //readbuffer에서 readline써서 \n까지 끊어읽는다
            //통신에서 \n은 여기까지 읽으라는 뜻이다 통신에서 \n를 쓰지않으면 상대방이 읽지를 못한다
            //보통 통신에 가장 마지막에 쓴다
            //"안녕\n" "반가워"를 쓰면 안녕만 읽고 반가워는 읽지 못한다
            //로그는 남지만 읽혀지지 않는다.
            //"통신에 기본엔 \n를 붙여야 합니다"
            //이런것도 통신프로토콜의 하나이다.
            bw.flush(); // flush를 해야 출력이 된다
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

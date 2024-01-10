package ex17.oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        // localhost = 127.0.0.1 (루프백 = 본인 컴퓨터로 돌아옴)
        try {
            Socket socket = new Socket("127.0.0.1", 10000); // 내가 만든게 문제 이기 때문에 오류를 눌러본다


            // 가나다라abc = 15byte -> UTF설정 안하면 한글 깨진다
            // 프로세스는 버퍼한테 데이터를 쏘고 스트림을 통해 내려온다
            // 그러나 1byte로 끊어 읽는 순간 한글은 깨진다
            // 그래서 UTF-8로 끊어 읽으라고 설명을 해주는 것
            // 몇 바이트로 썼는지 알아야 안깨짐
            // 문자인코딩은 UTF-8
            // 이모지는 4BYTE
            BufferedWriter bw = new BufferedWriter( // 소켓이 서버에 연결이 되면 버퍼를 생성시킴
                    new OutputStreamWriter
                            (socket.getOutputStream(), "UTF-8") //보조스트림

            );

            bw.write("msg1" + "\n");
            bw.write("msg2" + "\n");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();// 오류를 자세하게 보여준다 (개발할 때 많이 필요)
        }

    }
}

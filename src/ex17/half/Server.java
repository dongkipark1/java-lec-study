package ex17.half;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(20000); // 서버소켓, bind, listen
            Socket socket = serverSocket.accept(); // accept(), listen(감지)하고 있음

            // 소켓 연결 완료.....

            // 버퍼 만들기(received)
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String requestMsg = br.readLine();
            System.out.println("클라이언트로부터 받은 메시지 : " + requestMsg);

            // 버퍼 만들기 (send)
            // 동기적실행(응답을 받으면 순차적으로 진행됨)
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, Charset.forName("UTF-8")); // 버퍼라이터

            if (requestMsg.equals("1")) {
                pw.println("영화"); // "\"
            } else if (requestMsg.equals("2")) {
                pw.println("드라마");
            } else {
                pw.println("프로토콜을 확인하세요 : 1은 영화, 2는 드라마");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }//close해야 하지만 어차피 종료되서 필요없다.
    }
}

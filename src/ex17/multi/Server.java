package ex17.multi;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            // 1. 소켓과 버퍼 만들기
            ServerSocket serverSocket = new ServerSocket(20000); // 서버소켓, bind, listen
            Socket socket = serverSocket.accept(); // accept(), listen(감지)하고 있음 // 서버 확인
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            // 2. 메시지 읽기 스레드
            new Thread(() -> {
                while (true) {
                    try {
                        String requestMsg = br.readLine();
                        System.out.println("클라이언트로부터 받은 메시지 : " + requestMsg);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }).start();


            // 3. 메시지 쓰기 스레드
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream())
            );
            new Thread(() -> {
                while (true) {
                    String keyboardMsg = sc.nextLine();
                    pw.println(keyboardMsg);

                }
            }).start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }//close해야 하지만 어차피 종료되서 필요없다.
    }
}
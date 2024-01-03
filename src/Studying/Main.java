package Studying;

// 1. Runnable 인터페이스를 구현한 클래스 생성
class MyRunnable implements Runnable {
    public void run() {
        // 스레드가 실행할 코드 작성
        System.out.println("스레드가 실행 중입니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        // 3. Runnable 객체 생성
        MyRunnable myRunnable = new MyRunnable();

        // 4. Thread 객체 생성과 시작
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}

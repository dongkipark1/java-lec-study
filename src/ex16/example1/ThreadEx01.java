package ex16.example1;

public class ThreadEx01 {

    public static void start1() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("start1 thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void start2() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("start2 thread : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //main Thread
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            start1();
        });
        t1.start();

        start2();
    }
}

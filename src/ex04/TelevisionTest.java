package ex04;

public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television(7, 10, true);
        myTv.print();

        Television yourTv = new Television(9, 12, true);
        yourTv.print();
    }
}

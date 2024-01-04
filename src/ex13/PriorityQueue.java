package ex13;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        pq.add(30);
        pq.add(80);
        pq.add(20);

        System.out.println(pq);
        System.out.println("삭제된 원소: " + pq.remove()); // 작은 숫자를 우선순위로 둔다.
    }
}

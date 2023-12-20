package onlineStudy;

public class Study02 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        while (a<=10){
            sum += a; // sum = sum + a;
            a += 1; // a = a + 1; // a++는 a값을 수행하고 a값에 1을 더한다
        }
        System.out.println("sum :" + sum);
    }
}

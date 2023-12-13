package ex02;

public class TypeConversion {
    public static void main(String args[]){
        int i;
        double f;

        f = 1 / 5;
        System.out.println(f); // 소수점이 사라진다 > 0.0

        f = (double) 1 / 5;
        System.out.println(f); // 소수점이 생긴다 > 0.2

        i = (int) 1.7 + (int) 1.8;
        System.out.println(i); // 소수점이 사라지고 정수 1만 남아서 2가 된다 > 1+1=2
    }
}

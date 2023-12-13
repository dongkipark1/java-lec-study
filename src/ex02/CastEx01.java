package ex02;

public class CastEx01 {
    public static void main(String[] args) {
        int n1 = 1;
        double d1 = 1.5;

        n1 = 2;

        d1 = n1; // 묵시적 형변환 4칸에도 2 8칸에도 2 이것을 CAST했다고 함
        System.out.println(d1);
    }
}

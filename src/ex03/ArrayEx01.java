package ex03;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] arr = new int[3]; // int = 4byte 총 12byte를 찾아줌
        // 1 주소값을 찾아도 연속되어 있기 때문에 전부 찾아낼 수 있다.
        // 시작 번지가 4고 전체가 12니까 4+ 12 = 16-1

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        //arr[3] = 4; // 실행이 되지 않는다 인덱스에 예외가 발생
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);

        }
     }
}

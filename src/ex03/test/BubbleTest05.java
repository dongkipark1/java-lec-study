public class BubbleTest05 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 2, 3};
        int N = arr.length;

        int temp;

        for (int i = 0; i < N - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        //1회전
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}







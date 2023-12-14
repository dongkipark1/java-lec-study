package ex03;

public class ArrayTest01 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int a = 0; a < arr.length; a++) {
            arr[a] = a;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}

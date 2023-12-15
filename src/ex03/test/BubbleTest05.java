public class BubbleTest05 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 4, 2, 3};
        int N = arr.length;

        int temp;
        System.out.println("1회전");
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[j] + " ");
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
            System.out.println();
        }
        System.out.println("2회전");
        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[j] + " ");
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
            System.out.println();
        }
        System.out.println("3회전");

        for (int i = 0; i < N - 3; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[j] + " ");
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }


            }
            System.out.println();
        }
        System.out.println("4회전");

        for (int i = 0; i < N - 4; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[j] + " ");
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }


            }
            System.out.println();
        }
    }
}






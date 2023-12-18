package ex03.test;

public class BinaryTest01 {
    public static void main(String[] args) {
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; // 9 / 2 = 4

        int N = arr.length;

        final int target = 4;
        int start = 0;
        int end = N - 1;
        int mid;

        // 1회전

        mid = start + ((end - start) / 2);

        if (arr[mid] == target) {
            System.out.println(target + " 값은" + mid + " 번지에 있습니다");
        }

        if (arr[mid] < target) {
            start = mid + 1;
        }

        if (arr[mid] > target) {
            end = mid - 1;
        }
        System.out.println("round 1 start : " + start);
        System.out.println("round 1 end : " + end);

        // 2회전

        mid = start + ((end - start) / 2);

        if (arr[mid] == target) {
            System.out.println(target + " 값은" + mid + " 번지에 있습니다");
        }

        if (arr[mid] < target) {
            start = mid + 1;
        }

        if (arr[mid] > target) {
            end = mid - 1;
        }
        System.out.println("round 2 start : " + start);
        System.out.println("round 2 end : " + end);

        // 3회전

        mid = start + ((end - start) / 2);

        if (arr[mid] == target) {
            System.out.println(target + " 값은" + mid + " 번지에 있습니다");
        }

        if (arr[mid] < target) {
            start = mid + 1;
        }

        if (arr[mid] > target) {
            end = mid - 1;
        }
        System.out.println("round 3 start : " + start);
        System.out.println("round 3 end : " + end);

        // 3회전

        mid = start + ((end - start) / 2);

        if (arr[mid] == target) {
            System.out.println(target + " 값은" + mid + " 번지에 있습니다");
        }

        if (arr[mid] < target) {
            end = mid + 1;
        }

        if (arr[mid] > target) {
            start = mid - 1;
        }
        System.out.println("round 3 start : " + start);
        System.out.println("round 3 end : " + end);

        System.out.println("시간복잡도 : " + Math.log(N) / Math.log(2));


    } //MAIN 끝
}
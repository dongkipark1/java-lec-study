package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();

        int num;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                num = r.nextInt(45) + 1;
                arr[i] = num;
            } else {
                while (true) {
                    //0번지도 확인을 해야.... 이 코드는 전번지만 확인 할 수 있는 코드
                    num = r.nextInt(45) + 1;

                    if (arr[i - 1] != num) {
                        arr[i] = num;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

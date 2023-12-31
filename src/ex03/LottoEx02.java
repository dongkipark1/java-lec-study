package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx02 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;
        boolean isSame;

        //1. 6바퀴를 돌면서 로또 번호를 추첨할 예정
        //2. 1번째 바퀴는 공을 꺼내서 추첨한 번호를 그대로 입력
        //3. 두번째 바퀴 부터는 공을 꺼내서 이전에 추첨한 모든 번호와 (중복되었는지)비교 (isSame 값 만들기)
        //4. isSame == true >> 값이 겹치는 게 있다 (3번부터 다시 시작)
        //5. isSame == false >> (공 집어넣기 - 3번부터 다시 시작)

        for (int i = 0; i < 6; i++) {
            //공 꺼내서 바로 추가하는 코드
            if (i == 0) {
                num = r.nextInt(45) + 1;
                arr[i] = num;
                continue;
            }

            // 38이 들어가있다 꺼낸 공은 9
            while (true) {
                isSame = false;
                num = r.nextInt(45) + 1; // 1. 공을 꺼내는 코드 i == 0 비교 -->
                /**
                 * 2. 이전 번호들과 비교하는 코드
                 *  i == 1 (0 비교)
                 *  i == 2 (1, 0 비교)
                 *  i == 3 (2, 1, 0 비교)
                 *  이하 생략
                 */
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == num) {
                        isSame = true;
                        break;
                    }
                }
                // 3. 동일한 번호가 없으면 값 추가하기
                if (!isSame) {
                    arr[i] = num;
                    break;
                }
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}

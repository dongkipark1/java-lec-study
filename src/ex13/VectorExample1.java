package ex13;

import java.util.Collections;
import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector(); // 제네릭을 써서 사용
        vec.add("Apple"); //가변이기 때문에 계속 넣을 수 있음
        vec.add("Orange");
        vec.add("Mango");

        //크기
        System.out.println(vec.size());

        //인덱스 접근
        System.out.println(vec.get(1)); // 0번지: 사과 1번지: 오렌지 2번지: 망고

        System.out.println();
        //정렬 (오름차순)
        Collections.sort(vec);

        for (String s : vec) {
            System.out.println(s + " ");

        }
        System.out.println();

        // 정렬 (내림차순)
        Collections.sort(vec, Collections.reverseOrder());

        for (String s : vec) {
            System.out.println(s + " ");

        }

        // 정렬(다른 방법)
        //Arrays.sort();

        // 삭제 (특정 번지 날리기)
        String result = vec.remove(2); // return이 String
        System.out.println(result);
        System.out.println(vec.size()); // index 넘버를 표기

        System.out.println();

        // 값 찾기 (mango, Mango, mAngo, MANGO)
        boolean search = vec.contains("Mango"); // (mango (f), Mango (t), mAngo (f), MANGO (f))
        System.out.println(search); // 대소문자가 일치한 문자열이라면 true 그렇지 않다면 false

        String a = "Mango";
        boolean check = a.equalsIgnoreCase("mAngo"); // equalIgnoreCase 대소문자 구분 하지 않고 문자열 같으면 true 아니면 false
        System.out.println(check);
    }
}

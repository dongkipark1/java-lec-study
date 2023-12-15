package ex03;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();//ArrayList<타입>
        list. add("철수");
        list. add("영희");
        list. add("순신");
        list. add("지영");

        System.out.println(list.get(3)); // list.get(배열n) 초과하면 outofbound오류 남

        list.remove(3); // 3번째 list삭제

        System.out.println(list.get(3)); //index 3을 지웠기 때문에 outofbound 오류 남
    }
}

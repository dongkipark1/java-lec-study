package ex13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Milk");
        list.add("Bread");
        list.add("Butter");
        list.add(1, "Apple"); // 인덱스 1에 "Apple" 삽입
        list.set(2, "Grape"); // 인덱스 2(Bread)를 "Grape" 로 대체
        list.remove(3); // 인덱스 3(Butter)을 제거

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

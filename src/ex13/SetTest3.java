package ex13;

import java.util.TreeSet;

public class SetTest3 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);

        if (set.contains("Ham")) {
            System.out.println("Ham도 포함되어 있음"); // TreeHashSet을 쓰면 중복을 허용하지 않으며 알파벳 순서대로 출력이 된다
        }
    }
}

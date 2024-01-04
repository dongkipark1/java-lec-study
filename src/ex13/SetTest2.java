package ex13;

import java.util.LinkedHashSet;

public class SetTest2 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);

        if (set.contains("Ham")) {
            System.out.println("Ham도 포함되어 있음"); // LinkedHashSet을 쓰면 HashSet보다 느리고 중복을 허용하지 않으며 입력된 순서대로 출력이 된다
        }
    }
}

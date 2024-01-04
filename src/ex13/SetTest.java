package ex13;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Milk");
        set.add("Bread");
        set.add("Butter");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);

        if (set.contains("Ham")) {
            System.out.println("Ham도 포함되어 있음"); // HashSet을 하면 속도가 빠르고 중복을 허용하지 않지만 순서가 불명확하다
        }
    }
}

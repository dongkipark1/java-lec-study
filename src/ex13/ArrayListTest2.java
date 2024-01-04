package ex13;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args) {

        List<String> arr = new ArrayList<>();
        arr.add("Apple");
        arr.add("Banana");
        arr.add("Mango");
        arr.add("Grape");
        arr.add("Pear");

        int index = arr.indexOf("Mango");
        System.out.println("Mango의 위치는: " + index);
    }
}

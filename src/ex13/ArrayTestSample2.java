package ex13;

import java.util.ArrayList;

public class ArrayTestSample2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Grape");
        list.add("Pear");

        int index = list.indexOf("Mango");
        System.out.println("Mango의 위치는: " + index);
    }
}



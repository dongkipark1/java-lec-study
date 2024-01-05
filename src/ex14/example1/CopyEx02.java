package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class CopyEx02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // map (가공해서 복사)
        List<Integer> newList = list.stream().map((i) -> i * 100).toList();

        // forEach
        // for(Integer i : newList)
        // System.out.println(i)
        newList.stream().forEach(i -> System.out.println(i)); // Consumer는 return을 못하기 때문에
    }
}

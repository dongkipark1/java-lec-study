package ex14;

//단어들의 리스트를 받아서 각 단어의 길이 리스트를 반환하는 코드

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "Library");
        System.out.println("입력데이터 =" + words);
        List<Integer> result = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("실행결과 =" + result);
    }
}

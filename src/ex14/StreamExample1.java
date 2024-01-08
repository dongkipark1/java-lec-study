package ex14;

// 1부터 8까지를 저장하는 컬렉션을 만들고 이 중에서 짝수만을 골라내어 제곱하는 코드를 스트림 API로 만들어보고 람다식을 이용하자

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("입력데이터 =" + numbers);
        List<Integer> result =
                numbers.stream()
                        .filter(n -> {
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            return n * n;
                        })
                        .collect(Collectors.toList());
        System.out.println("실행결과 =" + result);
    }
}

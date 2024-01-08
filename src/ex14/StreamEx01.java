package ex14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//사용하는 데이터의 타입을 알고있다면 클래스 쓰면 된다

//타입이 같으니 배열, Arraylist, 벡터
//연속된 데이터이기 때문에 인덱스번호만 붙이면 됨

public class StreamEx01 {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "홍길동"); //NAME AGE
        data.put("age", 20);

        Map<String, Object> data2 = new HashMap<>(); //key 값으로 찾기위해 HashMap사용
        data2.put("name", "장보고"); //NAME AGE
        data2.put("age", 15);

        Map<String, Object> data3 = new HashMap<>();
        data3.put("name", "이순신"); //NAME AGE
        data3.put("age", 30);

        //map의 단점
        //1. 오타가 날 수 있다.
        //2. 다운캐스팅을 해야한다.

        List<Map<String, Object>> arr = Arrays.asList(data, data2, data3);

        List<Map<String, Object>> newArr = arr.stream().map(d -> {
            int newAge = (Integer) d.get("age") - 1; //맵 타입 자체가 오브젝트로 다운캐스팅 newAge라는 새로운 변수 만듦
            //MAP하는 건 데이터 가공
            d.put("age", newAge);
            return d;
        }).toList();

        newArr.stream().forEach(d -> {
            System.out.println(d.get("age"));
        });


    }
}

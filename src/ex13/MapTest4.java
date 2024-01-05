package ex13;

import java.util.HashMap;
import java.util.Map;

public class MapTest4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Kim", "1234");
        map.put("Park", "pass");
        map.put("Lee", "word");

        System.out.println(map.get("Lee")); // 키를 가지고 값을 참조한다.

        map.forEach((key, value) -> {           //라이브러리 활용
            System.out.println("key= " + key + ", value= " + value);
        });

        map.remove(3);   // 하나의 항목을 삭제한다.
        map.put("Choi", "password");  // 하나의 항목을 대치한다
        System.out.println(map);
    }
}

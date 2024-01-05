package ex13;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Kim", "1234");
        map.put("Park", "pass");
        map.put("Lee", "word");

        System.out.println(map.get("Lee")); // 키를 가지고 값을 참조한다.

        for (var key : map.keySet()) {   // for ~ each 기능과 변수 타입 추론 기능을 활용해 모든 항목을 방문한다.
            String value = map.get(key);
            System.out.println("key= " + key + ", value= " + value);
        }
        map.remove(3);   // 하나의 항목을 삭제한다.
        map.put("Choi", "password");  // 하나의 항목을 대치한다
        System.out.println(map);
    }
}
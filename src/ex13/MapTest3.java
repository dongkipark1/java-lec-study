package ex13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Kim", "1234");
        map.put("Park", "pass");
        map.put("Lee", "word");

        System.out.println(map.get("Lee")); // 키를 가지고 값을 참조한다.

        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {   //while문을 반복해서
            String key = it.next();
            System.out.println("key= " + key + ", value= " + map.get(key));
        }
        map.remove(3);   // 하나의 항목을 삭제한다.
        map.put("Choi", "password");  // 하나의 항목을 대치한다
        System.out.println(map);
    }
}
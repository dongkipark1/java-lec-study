package ex14.example1;

// 자바의 Collection 복사코드

import java.util.ArrayList;
import java.util.List;

public class CopyEx01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();   // Object와 var의 차이 -> Object타입은 Object만 var은 데이터를 받는 순간 타입이 정해진다.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //컬렉션 복사
        List<Integer> newList = new ArrayList<>(list);     // 1,2,3,4,가 stream(전개연산자)에서 흩뿌려짐 거기서 map을 쓴다는 것은 흩뿌려진 것을 순서대로 순회하는 것
        // 처음 i(1)로 가면 문자열 1을 리턴 2로가서 문자열 2로 리턴 ...... 문자열 1,2,3,4로 바뀜 그것을 .tolist로 감싸는 것

        list.add(5);

        System.out.println(list.size());
        System.out.println(newList.size());


    }
}

package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx01 {


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList();
        arr.add(1);
        arr.add(2);

        List<Integer> arr2 = Arrays.asList();
        //차이점이 뭔가 벡터도 있고 arraylist도 있는데
        //벡터는 동기화(synchronized)가 자동으로 걸려있지만 Arraylist는 동기화가 걸려있지 않다.
        //티비를 볼 때는 자원이 변경되지 않고 리딩만 하면 되니까 동기화가 중요하지 않다.
        //자원에 변경이 생길 때만 동기화가 중요해 진다. 단순 조회만으로는 동기화가 필요하지는 않다.
        //벡터는 2개이상의 스레드가 동시에 실행되지 않는다

    }
}

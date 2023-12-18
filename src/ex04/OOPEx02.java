package ex04;

class Person4 {
    //상태 = 변수
    private int weight = 100;

    public int getWeight() { // (): 투입구
        return weight; //Weight라는 메시지를 호출 했을 때 weight를 돌려주는 값
        // return은 투입구가 있거나 없어도 돌아오는 것
        // ex)고깃집 커피 투입구는 없고 리턴은 있음
        // ex)오락실 동전 투입구는 있으나 리턴은 없음
        // ex)자판기 동전 투입구도 있고 리턴도 있음

    }

    // 행위 = 메서드
    public void exercise() {
        weight = weight - 10; //감소코드를 적어주면 된다
        //예상가능한 프로그램이 된다.
    }
}

public class OOPEx02 {
    public static void main(String[] args) {


        Person4 p4 = new Person4();
        System.out.println("p4의 몸무게는 : " + p4.getWeight());

        for (int i = 0; i < 10; i++) {
            p4.exercise();
            System.out.println("p4의 몸무게는 : " + p4.getWeight());

        }

    }
}
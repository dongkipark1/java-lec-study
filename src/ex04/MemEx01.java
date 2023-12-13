package ex04;

class Person1{ // custom 자료형
    static int age = 20;
    static char gender = '여'; //primitive(원시) 자료
}

public class MemEx01 {
    public static void main(String[] args) { //main으로 해야 실행이 가능하다 , 모든 것은 Mem에 떠야한다
        System.out.println(Person1.age);
        System.out.println(Person1.gender);

    }
}
// 공적할당: 비용이 많이 드니 효율적으로 공간을 이용하기 위해


package ex04;

class Person2{
    int age = 10;
    char gender = '남';

}
public class MemEx02 {
    public static void main(String[] args) {
        System.out.println("1년 지남");
        System.out.println("2년 지남");
        System.out.println("3년 지남");

        Person2 p2 = new Person2(); // 동적할당 : 공간을 효율적으로 이용하기 위해 쓰는 것
        // person2(커스텀타입) p(변수, 숫자안됨) new(동적할당)
        System.out.println(p2.age);
        System.out.println(p2.gender);

        System.out.println("메인 종료");
    }

}

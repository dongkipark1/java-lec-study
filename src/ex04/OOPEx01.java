package ex04;

class Person3 { //Person3는 존재하게 만든다
    int weight = 100;
}

public class OOPEx01 {
    public static void main(String[] args) {
        Person3 p3 = new Person3();
        System.out.println("p3의 몸무게는 : " + p3.weight);

        p3.weight = 60;
        System.out.println("p3의 몸무게는 : " + p3.weight);
    } // 문법적으로 잘못되지는 않았으나 행위가 있어야 프로그램이 돌아간다


}

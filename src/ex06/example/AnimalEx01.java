package ex06.example;

class Animal {

    void speak() {
        System.out.println("멍멍멍멍멍");
    }
    void run() {
        System.out.println("달린다");
    }
}

class Cat extends Animal {
    void speak() {                //재정의 : 맘에 안드는 메서드를 덮어씌우는 기능
        System.out.println("야옹");
    }
}

public class AnimalEx01 {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.speak();
        c1.run();
    }
}

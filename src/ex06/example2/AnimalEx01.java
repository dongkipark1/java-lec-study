package ex06.example2;

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
        //Animal a1 = new Animal();
        Animal c1 = new Cat(); // [Cat, Animal] 다형성: Type을 둘 중에 하나를 사용 가능하다. //Animal을 바라보고 있지만 자식이 들고있으면 양보(무효화)
        //무효화 시키고 자식 것을 실행시키는 걸 동적 바인딩
        c1.speak();
        c1.run();
    }
}

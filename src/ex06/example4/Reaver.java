package ex06.example4;

public class Reaver extends Protoss {
    String name;

    public Reaver(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("리버가 공격합니다 : " + name);
    }

}

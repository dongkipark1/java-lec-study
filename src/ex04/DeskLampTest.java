package ex04;

public class DeskLampTest {
    public static void main(String[] args) {
        //객체를 생성하려면 new 예약어를 사용한다.
        DeskLamp lamp = new DeskLamp();

        //객체의 메서드를 호출하려면 도트 연산자인 .을 사용한다
        lamp.turnOn();
        System.out.println(lamp);
        lamp.turnOff();
        System.out.println(lamp);
    }
}

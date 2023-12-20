package ex04;

public class DeskLamp {
    //인스턴스 변수 정의
    private boolean isOn;       //켜짐이나 꺼짐과 같은 램프의 상태

    //상태는 행위를 통해 변경
    //메소드 정리
    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String toString() { //toString = 객체의 상태를 확인할 때
        return "현재 상태는" + (isOn == true ? " 켜짐" : " 꺼짐");
    }
}

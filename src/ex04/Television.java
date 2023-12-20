package ex04;

public class Television {
    //상태
    int channel;  //채널 번호
    int volume;   //볼륨
    boolean onOff; //전원 상태

    Television(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은 " + channel + "이고, 볼륨은 " + volume + "입니다.");
    }
}

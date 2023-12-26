package ex07;

// Event가 언제 올지 모름
// Event 감지 힘들다
// Listener를 두고 계속 확인하고 Event를 감지해야(데몬을 돌린다)
// Listener의 설정을 어떻게 해야하나 감지 속도를 빠르게 하고 리소스를 많이 쓰는지
// Listener의 감지 속도를 늦추고 리소스를 적게 쓰는지

// 라이브러리 판매자가 만듦
interface EventListener { //EventListener(Event감지자)
    void action();

}


//라이브러리 판매자가 만듦
class MyApp {

    public void click(EventListener l) {
        l.action();
    }
}


public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> {
            System.out.println("회원가입 로직이 실행됩니다");
        });
    }
}

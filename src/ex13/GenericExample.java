package ex13;

// 제네릭 클래스
class Box1<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class GenericExample {
    public static void main(String[] args) {
        // 문자열을 담는 Box 객체 생성
        Box1<String> stringBox = new Box1<>();
        stringBox.setData("Hello, Generics!");

        // 정수를 담는 Box 객체 생성
        Box1<Integer> intBox = new Box1<>();
        intBox.setData(10);

        // 데이터 가져오기
        String str = stringBox.getData();
        int number = intBox.getData();

        System.out.println(str);
        System.out.println(number);
    }
}
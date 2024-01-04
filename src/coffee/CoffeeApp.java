package coffee;

public class CoffeeApp {
    public static void main(String[] args) { // Barista 는 누가 new 해줄 수 없기 때문에 main 에 권한이 있다
        // Customer 는 누가 new 해줄 수 없기 때문에 main 에 권한이 있다
        Barista barista = new Barista();
        Customer customer = new Customer(barista); // 고객은 바리스타한테 의존적이다 -> 바리스타가 없으면 커피를 마시지 못한다.

        customer.order("아메리카노");
    }
}

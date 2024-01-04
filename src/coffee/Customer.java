package coffee;

public class Customer {

    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }   // 의존적인 관계가 있다(고객은 바리스타가 필요) >> 필요한쪽(고객)으로 넘겨주면 된다 -> 의존적인 관계는 Composition 하면 된다.

    public void order(String menuName) {  //Customer가 주문(주문의 책임)을 했으니 Barista는 이를 받아들이고 협력을 해야한다
        Coffee coffee = barista.makeCoffee();
        System.out.println(coffee.name + "을(를) 받았습니다");
    }
}

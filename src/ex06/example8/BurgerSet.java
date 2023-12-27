package ex06.example8;

public class BurgerSet { //has 관계 has burger, has coke
    private Burger burger;
    private Coke coke; // 잘 만들어진 클래스에 객체를 쓰는것을 composition 이라 한다. 이것은 상속이 아니다.

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌습니다");
    }

    public int getTotalPrice() {
        return burger.getPrice() + coke.getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}

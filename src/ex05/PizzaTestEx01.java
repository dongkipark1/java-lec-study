package ex05;

public class PizzaTestEx01 {
    public static void main(String[] args) {
        PizzaEx01 p1 = new PizzaEx01("Super supreme");
        PizzaEx01 p2 = new PizzaEx01("Potato");
        PizzaEx01 p3 = new PizzaEx01("Cheese");

        int n = PizzaEx01.count;
        System.out.println("지금 까지 판매 된 피자 수 : " + n);
    }
}

package ex05;

public class PizzaEx01 {
    private String toppings;
    private int radius;
    static final double PI = 3.141592;
    static int count = 0;

    public PizzaEx01(String toppings) {
        this.toppings = toppings;
        count++;
    }
}

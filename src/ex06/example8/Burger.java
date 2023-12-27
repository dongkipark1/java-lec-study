package ex06.example8;

public class Burger {
    private String name;
    private int price;

    public Burger(String name, int price) { // 생성자 만들기 alt+insert
        this.name = name;
        this.price = price;
        System.out.println(name + "가(이) 만들어졌어요");
    }

    //햄버거를 팔 때는 상태변경(setter) 필요없음
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

package ex06.example8;

public class LotteApp {
    public static void main(String[] args) {
        Burger b1 = new Burger("기본버거", 1000); // [Burger]
        Burger b2 = new ShrimpBurger("새우버거", 2000, "새우"); // Burger는 다형성 [Burger,ShrimpBurger]
        Coke c1 = new Coke("콜라", 1000);
        System.out.println();
        BurgerSet set1 = new BurgerSet(new Burger("기본버거", 1000), new Coke("콜라", 1000)); // 이 code 를 composition code 라 한다

        System.out.println("총 가격은: " + set1.getTotalPrice());

//        System.out.println(set1.getBurger().getPrice());
//        System.out.println(set1.getCoke().getPrice());
    }
}

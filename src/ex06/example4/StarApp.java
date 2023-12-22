package ex06.example4;

public class StarApp {

    public static void gameStart(Protoss u1, Protoss u2) {
        u1.attack();
        u2.attack();
    }


    public static void main(String[] args) {
        Zealot z1 = new Zealot("z1"); // [Zealot, Protoss]
        Dragoon d1 = new Dragoon("d1"); //[Dragoon, Protoss]
        Reaver r1 = new Reaver("r1"); //[Reaver, Protoss]
        DarkTempler dark1 = new DarkTempler("dark1"); //[DarkTempler, Protoss]

        gameStart(z1, d1);
        gameStart(dark1, d1);
        //타입을 일치시켜서 실행하는 용도로 쓴다(동적바인딩)


    }
}

package ex06.example3;


public class StarApp {

    public static void gameStart(Zealot u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Zealot u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, Zealot u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Dragoon u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Reaver u1, Dragoon u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Reaver u1, Zealot u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, Reaver u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Reaver u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Reaver u1, Reaver u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(DarkTempler u1, Zealot u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(DarkTempler u1, Dragoon u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(DarkTempler u1, DarkTempler u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(DarkTempler u1, Reaver u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, DarkTempler u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, DarkTempler u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Reaver u1, DarkTempler u2) { //메서드 이름이 동일해도 타입만 바꿔주면 된다 (오버로딩)
        u1.attack();
        u2.attack();
    }


    public static void main(String[] args) {
        Zealot z1 = new Zealot("z1");
        Dragoon d1 = new Dragoon("d1");
        Zealot z2 = new Zealot("z2");
        Dragoon d2 = new Dragoon("d2");
        Reaver r1 = new Reaver("r1");
        Reaver r2 = new Reaver("r2");
        DarkTempler t1 = new DarkTempler("t1");
        DarkTempler t2 = new DarkTempler("t2");


        gameStart(z1, d1); // 질럿이 드라군 때려
        gameStart(d1, z1); // 드라군이 질럿 때려
        gameStart(z2, z1); // 질럿이 질럿 때려
        gameStart(d1, d2); // 드라군이 드라군 때려
        gameStart(r1, z1); // 리버가 질럿 때려
        gameStart(r1, d1); // 리버가 드라군 때려
        gameStart(z1, r1); // 질럿이 리버 때려
        gameStart(d1, r1); // 드라군이 리버 때려
        gameStart(r1, r2); // 리버가 리버 때려
        gameStart(t1, z2); // 다크템플러가 질럿 때려
        gameStart(t1, d2); // 다크템플러가 드라군 때려
        gameStart(t1, r2);  // 다크템플러가 리버 때려
        gameStart(t1, t2); // 다크템플러가 다크템플러 때려
        gameStart(z1, t2); // 질럿이 다크템플러 때려
        gameStart(d1, t2); // 드라군이 다크템플러 때려
        gameStart(r1, t2); // 리버가 다크템플러 때려

    }
}

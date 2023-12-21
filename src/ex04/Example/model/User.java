package ex04.Example.model;

public class User {
    final int id; //모든 데이터는 고유번호가 있는게 좋다 찾기 용이하게 하기위해
    String name;
    String email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}

package ex04.example.model;

public class Account01 {
    private final int id;
    private long balance; //balance의 상태가 바뀜
    private int userId;

    //메서드는 하나의 책임만 가진다.(객체지향)
    public void 출금(long amount) { //출금은 출금만 하면된다 복잡하게 파라미터를 늘릴 필요없다
        this.balance = this.balance - amount;
    }

    //상태를 변경하는 행위는 무조건 메서드를 만들어야
    public void 입금(long amount) {
        this.balance = this.balance + amount;
    }

    public Account01(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account01{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}

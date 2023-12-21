package ex04.Example.model;

public class Account01 { //Account01은 여러개의 데이터를 들고 있어서 object
    public final int id; // 계좌번호 (계좌번호는 숫자 4자리로 만들어져있다)  //final 앞에 아무것도 안적혀져있다 default 제어 되어있음 때문에 같은 패키지에서 접근가능
    public long balance;
    public int userId; // 누구 계좌인지는 알아야
    //개발자는 요구사항에 맞게 만드는 게 좋은 개발자다

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


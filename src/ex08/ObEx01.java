package ex08;

class Account extends Object { //extends Object 생략할 수 있다 때문에 모든 class는 object이다.
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("홍길동", 1111, 1000);
        System.out.println(account);
        System.out.println(account2);
        System.out.println(account.hashCode());
        System.out.println(account2.hashCode());

        //메모리 주소 비교(==)  타입의 기본형일 경우 == 는 값을비교 레퍼런스형일 경우 ==은 주소를 비교
        if (account == account2) {
            System.out.println("같아요?"); // 실행값은 같다 나오지 않는다
        }

        //account -> equals() (오브젝트) : 주소비교
        //account.toString(). -> equals() : 주소비교 and 값비교
        if (account.toString().equals(account2.toString())) {
            System.out.println("같아요?");
        }
        String s1 = new String("물");
        String s2 = new String("물");

        System.out.println(s1.equals(s2));

    }
}

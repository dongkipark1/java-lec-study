package ex04.example;

import ex04.example.model.Account01;

//트랜잭션 관리
public class BankService {

    public static void 이체(Account01 senderAccount, Account01 receiverAccount, long amount) {
        if (amount <= 0) {
            System.out.println("0원이하 이체 불가");
            return;
        }

        senderAccount.출금(amount);
        receiverAccount.입금(amount);
    }
}

package Day06;

import java.util.ArrayList;

public class Bank {

    ArrayList<BankAccount> accounts = new ArrayList<>();

    // 계좌 등록 기능
    void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // 전체 계좌 출력
    void printAllAccounts() {
        System.out.println("===== 은행 전체 계좌 목록 =====");
        for (BankAccount acc : accounts) {
            acc.printInfo();
        }
    }
}

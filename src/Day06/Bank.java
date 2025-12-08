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
    
    //계좌번호로 계좌 찾기
    BankAccount findAccount(String accNumber) {
    	for (BankAccount acc : accounts) {
    		if (acc.getAccountNumber().equals(accNumber)) {
    			return acc;
    		}
    	}
    	return null; //못찾으면 null
    }
    
}
package Day06;

public class BankAccount {

    String owner;
    int balance;
    String accountNumber;

    public BankAccount(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }
    
    public String getAccountNumber() {
    	return accountNumber;
    }
    

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족!");
        } else {
            balance -= amount;
        }
    }

    void printInfo() {
        System.out.println("계좌번호: " + accountNumber + 
                           ", 이름: " + owner + 
                           ", 잔액: " + balance + "원");
    }

}

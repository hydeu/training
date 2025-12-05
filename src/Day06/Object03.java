package Day06;

class BankAccount2{
	
	String owner;
	int balance;
	
	
	public BankAccount2(String owner, int balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	void deposit(int amount) {
		balance = amount+balance;
	}
	
	void withdraw(int amount) {
		if(balance<amount) {
			System.out.println("잔액 부족");
		}else {
			balance -= amount;
		}
	}
	
	void printBalance() {
		System.out.println("현재 잔액 : " + balance + "원");
	}
	
}



public class Object03 {

	public static void main(String[] args) {
		BankAccount2 ba = new BankAccount2("joo", 10000);
		
		ba.deposit(5000);
		ba.withdraw(3000);
		ba.deposit(2000);
		ba.printBalance();
	}

}

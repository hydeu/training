package Day06;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		BankAccount a1 = new BankAccount("joo", 10000, "123-111");
		BankAccount a2 = new BankAccount("hoo", 20000, "123-222");
		BankAccount a3 = new BankAccount("goo", 30000, "123-333");
		
		
		bank.addAccount(a1);
		bank.addAccount(a2);
		bank.addAccount(a3);

		bank.printAllAccounts();
	}

}

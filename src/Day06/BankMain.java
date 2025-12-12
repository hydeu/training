package Day06;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		/*
		BankAccount a1 = new BankAccount("joo", 10000, "123-111");
		BankAccount a2 = new BankAccount("hoo", 20000, "123-222");
		BankAccount a3 = new BankAccount("goo", 30000, "123-333");
		BankAccount a4 = new BankAccount("narin", 40000, "1111");
		
		bank.addAccount(a1);
		bank.addAccount(a2);
		bank.addAccount(a3);
		bank.addAccount(a4);

		bank.printAllAccounts();
		
		//검색 테스트
		BankAccount acc = bank.findAccount("1111");
		
		if(acc != null) {
			System.out.println("계좌 찾기 성공!");
			acc.deposit(5000); //입금
			acc.withdraw(3000); //출금
			acc.printInfo();
		} else {
			System.out.println("계좌번호가 존재하지 않습니다.");
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n==== 은행 메뉴 ====");
			System.out.println("1. 계좌 생성");
            System.out.println("2. 계좌 조회");
            System.out.println("3. 입금");
            System.out.println("4. 출금");
            System.out.println("5. 전체 계좌 조회");
            System.out.println("0. 종료");
            System.out.print("메뉴 선택: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); //버퍼 제거
            switch (choice) {
            case 1 -> createAccount(bank, sc);
            case 2 -> findAccount(bank, sc);
            case 3 -> deposit(bank, sc);
            case 4 -> withdraw(bank, sc);
            case 5 -> bank.printAllAccounts();
            case 0 -> {
                System.out.println("프로그램 종료!");
                return;
            }
            default -> System.out.println("잘못된 입력입니다.");
           }
		}
	}
	
	// 계좌 생성
    static void createAccount(Bank bank, Scanner sc) {
        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("초기 입금액: ");
        int balance = sc.nextInt();
        sc.nextLine(); // 버퍼 제거

        System.out.print("계좌번호: ");
        String accountNumber = sc.nextLine();

        BankAccount newAcc = new BankAccount(name, balance, accountNumber);
        bank.addAccount(newAcc);

        System.out.println("계좌 생성 완료!");
    }

    // 계좌 조회
    static void findAccount(Bank bank, Scanner sc) {
        System.out.print("찾을 계좌번호: ");
        String accNum = sc.nextLine();

        BankAccount acc = bank.findAccount(accNum);

        if (acc != null) {
            System.out.println("계좌 조회 성공!");
            acc.printInfo();
        } else {
            System.out.println("계좌가 존재하지 않습니다.");
        }
    }

    // 입금
    static void deposit(Bank bank, Scanner sc) {
        System.out.print("입금할 계좌번호: ");
        String accNum = sc.nextLine();

        BankAccount acc = bank.findAccount(accNum);
        if (acc == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }

        System.out.print("입금액 입력: ");
        int amount = sc.nextInt();
        sc.nextLine();

        acc.deposit(amount);
        System.out.println("입금 완료!");
    }

    // 출금
    static void withdraw(Bank bank, Scanner sc) {
        System.out.print("출금할 계좌번호: ");
        String accNum = sc.nextLine();

        BankAccount acc = bank.findAccount(accNum);
        if (acc == null) {
            System.out.println("계좌가 존재하지 않습니다.");
            return;
        }

        System.out.print("출금액 입력: ");
        int amount = sc.nextInt();
        sc.nextLine();

        acc.withdraw(amount);
    }
}
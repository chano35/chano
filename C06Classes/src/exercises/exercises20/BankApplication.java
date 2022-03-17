package exercises.exercises20;

import java.util.Scanner;

public class BankApplication {
	static final int MAX_ACCOUNT = 100;
	private static Account[] accounts = new Account[MAX_ACCOUNT];
	private static Scanner scanner = new Scanner(System.in);
	private static int lastAccount = 0;

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			int selectNo = selectMenu();
			
			switch(selectNo) {
			case 1: // 계좌생성
				createAccount();
				break;
				
			case 2: // 계좌목록
				accountList();
				break;
				
			case 3: // 예금
				deposit();
				break;
				
			case 4: // 출금
				withdraw();
				break;
			
			case 5: // 종료
				run = false;
				break;
			}
		} // while
	}
	
	private static int selectMenu() {
		System.out.println("+-------------+-------------+---------+---------+---------+");
		System.out.println("| [1]계좌생성 | [2]계좌목록 | [3]예금 | [4]출금 | [5]종료 |");
		System.out.println("+-------------+-------------+---------+---------+---------+");
		System.out.print("선택> ");
		
		// return BankApplication.scanner.nextInt();
		return scanner.nextInt();
	}
	
	private static void createAccount() {
		if(lastAccount >= BankApplication.MAX_ACCOUNT) {
			System.out.println("계좌수가 다 찾습니다.");
			return;
		}
		
		System.out.println("+-------------+");
		System.out.println("| [1]계좌생성 |");
		System.out.println("+-------------+");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("예금주: ");
		String owner = scanner.next();
		
		System.out.print("입금액: ");
		int balance = scanner.nextInt();

		// Account account = new Account(ano, owner, balance);
		// accounts[lastAccount++] = account;
		
		accounts[lastAccount++] = new Account(ano, owner, balance);
	}
	
	private static void accountList() {
		System.out.println("+-------------+");
		System.out.println("| [2]계좌목록 |");
		System.out.println("+-------------+");

		for(int cnt = 0; cnt < lastAccount; cnt++) {
			Account account = accounts[cnt];
			System.out.printf("%10s %10s %10d\n", account.getAno(), account.getOwner(), account.getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("+---------+");
		System.out.println("| [3]예금 |");
		System.out.println("+---------+");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("입금액: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account != null) {
			account.addBalance(balance);
			System.out.println("예금: 잔고" + account.getBalance());
		}
	}
	
	private static void withdraw() {
		System.out.println("+---------+");
		System.out.println("| [4]출금 |");
		System.out.println("+---------+");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.print("출금액: ");
		int balance = scanner.nextInt();
		
		Account account = findAccount(ano);
		if(account != null) {
			account.delBalance(balance);
			System.out.println("출금: 잔고" + account.getBalance());
		}
	}
	
	private static Account findAccount(String ano) {
		for(Account account : accounts) {
			if(ano.equals(account.getAno())) {
				return account;
			}
		}
		
		return null;
	}
}

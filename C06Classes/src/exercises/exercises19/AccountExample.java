package exercises.exercises19;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		account.printBalance();
		System.out.println("$ 현재잔고: " + account.getBalance());
		
		account.setBalance(-10000);
		account.printBalance();
		System.out.println("$ 현재잔고: " + account.getBalance());

		account.setBalance(2000000);
		account.printBalance();
		System.out.println("$ 현재잔고: " + account.getBalance());

	}

}
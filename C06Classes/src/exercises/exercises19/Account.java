package exercises.exercises19;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance;

	void setBalance(int balance) {
		if(balance >= Account.MIN_BALANCE && balance <= Account.MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	int getBalance() {
		return this.balance;
	}
	
	void printBalance() {
		System.out.println("현재잔고: " + this.balance);
	}
}

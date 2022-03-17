package deepcloneobject;

public class CashPoint {
	private int[] cash;
	
	public CashPoint() {
		cash = new int[3];
	}
	
	public CashPoint(int[] cash) {
		this.cash = cash;
	}
	
	public int[] getCash() {
		return this.cash;
	}
	
	public int getCash(int index) {
		if(index < 0 || index >= cash.length) {
			return 0;
		}
		
		return this.cash[index];
	}
	
	public int setCash(int index, int coin) {
		if(index < 0 || index >= cash.length) {
			return 0;
		}
		
		this.cash[index] = coin;
		
		return coin;
	}
	
	public void printPoint() {
		System.out.print("[CashPoint] ");
		for(int coin : cash) {
			System.out.printf("[%d]", coin);
		}
		System.out.println();
	}
}
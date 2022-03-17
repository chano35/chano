package deepcloneobject2;

import java.util.Arrays;

public class CashPoint implements Cloneable {
	// private int[] cash;
	private int[] cash = new int[3];
	
	public CashPoint() {
		// cash = new int[3];
	}
	
	public CashPoint(int[] cash) {
		this.cash = cash;
	}
	
	/*
	 *  public static int[] copyOf(int[] original, int newLength) {
     *     int[] copy = new int[newLength];
     *     System.arraycopy(original, 0, copy, 0, Math.min(original.length, newLength));
     *     return copy;
     * }
	 */
	@Override 
	protected Object clone() throws CloneNotSupportedException {
		CashPoint cashpoint = (CashPoint)super.clone();
		cashpoint.cash = Arrays.copyOf(this.cash, this.cash.length);
		
		return cashpoint;
	}
	
	protected Object clone2() {
		// clone
		// CashPoint cashpoint = new CashPoint();
		// cashpoint.cash = this.cash;
		
		CashPoint cashpoint = new CashPoint();
		for(int x = 0; x < this.cash.length; x++) {
			cashpoint.cash[x] = this.cash[x];
		}
		
		return cashpoint;
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
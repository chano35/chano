package calc;

public class Calc {
	protected int sum;	//자식 클래스에서 접근 허용
	int prevsum;		//default 접근자
	private int privsum = -1;
	
	public Calc() {
		this.sum = 0;
	}
	public Calc(int sum) {
		this.prevsum = this.sum;
		this.sum = sum;
	}
	public int compute(int x) {	//더하기
		this.prevsum = this.sum;
		this.sum += x;
		return this.sum;
	}
	protected void setPrevSum() {
		this.prevsum = this.sum;
	}
	public int getSum() {
		return this.sum;
	}
	
	public void setSum(int sum) {
		this.prevsum = this.sum;
		this.sum = sum;
	}
	
	protected int getPrivSum() { 
		return this.privsum; // 자식은 읽기만 가능
	}
}

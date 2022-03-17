package priorities;

public class CalcThread extends Thread {
	int count;
	double tot;
	
	public CalcThread(String name, int count) {
		super.setName(name);
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int cnt = 1; cnt <= count; cnt++) {
			tot += (double)cnt;
		}
		
		System.out.printf("[CalcThread] [%s] tot[%.0f]%n", getName(), tot);
	}
	
	public double total() {
		return this.tot;
	}

}
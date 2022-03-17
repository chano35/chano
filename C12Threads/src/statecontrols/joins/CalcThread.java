package statecontrols.joins;

public class CalcThread extends Thread {
	long count;
	double tot;
	
	public CalcThread(String name, long count) {
		super.setName(name);
		this.count = count;
	}
	
	@Override
	public void run() {
		for(long cnt = 1; cnt <= count; cnt++) {
			tot += (double)cnt;
		}
		
		System.out.printf("[CalcThread] [%s] tot[%.0f]%n", getName(), tot);
	}
	
	public synchronized double total() {
		return this.tot;
	}

}
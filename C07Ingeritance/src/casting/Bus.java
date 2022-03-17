package casting;

public class Bus extends Vehicle {
	
	int station;	//정거장
	
	public void run() {
		this.station++;
		print();
	}
	
	public void run(int station) {
		this.station += station;
		print();
	}
	
	public int getStation() {
		return this.station;
	}
	public void print() {
		System.out.println("Bus : 버스가 달린다. 정거장=" + this.station);
	}
	
	

}

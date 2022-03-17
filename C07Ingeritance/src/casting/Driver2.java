package casting;

public class Driver2 {
	static final int BUS = 1;
	static final int TAXI = 2;
	static final int TRUCK = 3;
	static final int MYCAR = 4;
	
	Bus bus;
	Taxi taxi;
	Truck truck;
	MyCar mycar;
	
	public Driver2() {
	}
	
	public Driver2(Bus bus) {
		this.bus = bus;
	}
	
	public Driver2(Taxi taxi) {
		this.taxi = taxi;
	}
	
	public Driver2(Truck truck) {
		this.truck = truck;
	}

	public Driver2(MyCar mycar) {
		this.mycar = mycar;
	}
	
	public void run() {
		if(this.bus != null) {
			this.bus.run();
		}
		else if(this.taxi != null) {
			this.taxi.run();
		}
		else if(this.truck != null) {
			this.truck.run();
		}
		else if(this.mycar != null) {
			this.mycar.run();
		}
	}
	
	public void run(int vehicle) {
		if(vehicle == BUS) {
			if(this.bus != null) {
				this.bus.run();
				return;
			}
			System.out.println("해당하는 버스가 배정되지 않았습니다.");
		}
		else if(vehicle == TAXI) {
			if(this.taxi != null) {
				this.taxi.run();
				return;
			}
			System.out.println("해당하는 택시가 배정되지 않았습니다.");
		}
		else if(vehicle == TRUCK) {
			if(this.truck != null) {
				this.truck.run();
				return;
			}
			System.out.println("해당하는 트럭이 배정되지 않았습니다.");
		}
		else if(vehicle == MYCAR) {
			if(this.mycar != null) {
				this.mycar.run();
				return;
			}
			System.out.println("해당하는 승용차가 배정되지 않았습니다.");
		}
		else {
			System.out.println("해당하는 차량이 없습니다.");
		}
	}

}
package casting;

public class Driver {
	Vehicle vehicle;
	
	public Driver() {
	}
	
	public Driver(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void drive() {
		if(this.vehicle != null) {
			this.drive(this.vehicle);
		}
	}

	public void run() {
		if(this.vehicle != null) {
			this.run(this.vehicle);
		}
	}
	
	public void run(Vehicle vehicle) {
		vehicle.run();
	}

	public void drive(Vehicle vehicle) {
		/*
		 * Vehicle을 상속한 모든 자식은 부모로 인식
		if(vehicle instanceof Vehicle) {
			System.out.println("vehicle is Vehicle");
		}
		*/
		
		if(vehicle instanceof Bus) {
			System.out.println("vehicle is Bus");
		}
		else if(vehicle instanceof Taxi) {
			System.out.println("vehicle is Taxi");
		}
		else if(vehicle instanceof Truck) {
			System.out.println("vehicle is Truck");
		}
		else {
			System.out.println("vehicle is Unknown!!!");
		}
	}
	
	

	/*
	public void run(Bus bus) {
		System.out.println("Bus!!!");
		bus.run();
	}
	
	public void run(Taxi taxi) {
		System.out.println("Taxi!!!");
		taxi.run();
	}
	public void run(Truck truck) {
		System.out.println("Truck!!!");
		truck.run();
	}
	*/
}
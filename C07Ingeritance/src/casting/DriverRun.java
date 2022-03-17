package casting;

public class DriverRun {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Vehicle());
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
		driver.drive(new Truck());
		
		/*
		driver.run(new Bus());
		driver.run(new Taxi());
		driver.run(new Truck());
		*/
	}

}
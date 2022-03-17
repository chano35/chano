package casting;

public class DriverRun2 {

	public static void main(String[] args) {
		/*
		Taxi taxi = new Taxi();
		Driver driver = new Driver(taxi);
		taxi.run();
		driver.run();
		*/
		
		Driver driver = new Driver(new Taxi());
		driver.drive();
		driver.run();
	}

}
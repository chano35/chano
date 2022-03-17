package casting;

public class Driver2Run {

	public static void main(String[] args) {
		Driver2 bus = new Driver2(new Bus());
		bus.run();
		
		Driver2 taxi = new Driver2(new Taxi());
		taxi.run(Driver2.TAXI);
		taxi.run(Driver2.TRUCK); // 배정되지 않은 차량
		taxi.run(Driver2.BUS);   // 배정되지 않은 차량
	}

}
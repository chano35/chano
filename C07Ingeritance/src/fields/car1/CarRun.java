package fields.car1;

public class CarRun {
	static final int MAX_COUNT = 5;

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int cnt = 1; cnt <= MAX_COUNT; cnt++) {
			int problemLocation = car.run(cnt);
			
			switch(problemLocation) {
				case Car.FRONT_LEFT_TIRE:
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					break;
				case Car.FRONT_RIGHT_TIRE:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);	
					break;
				case Car.BACK_LEFT_TIRE:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);	
					break;
				case Car.BACK_RIGHT_TIRE:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.backRightTire = new KumhoTire("뒤오른쪽", 17);		
					break;
			}
			System.out.println("----------------------------------------");
		}
		

	}

}
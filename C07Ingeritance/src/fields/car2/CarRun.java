package fields.car2;

public class CarRun {
	static final int MAX_COUNT = 5;

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int cnt = 1; cnt <= MAX_COUNT; cnt++) {
			int problemLocation = car.run(cnt);
			int locationTire = -1;
			
			switch(problemLocation) {
				case Car.FRONT_LEFT_TIRE:
					System.out.println("앞왼쪽 HankookTire로 교체");
					locationTire = car.changeTire(problemLocation, new HankookTire("앞왼쪽", 15));
					break;
					
				case Car.FRONT_RIGHT_TIRE:
					System.out.println("앞오른쪽 KumhoTire로 교체");
					// locationTire = car.changeTire(problemLocation, new KumhoTire("앞오른쪽", 13));	
					locationTire = car.changeTire(5, new KumhoTire("앞오른쪽", 13));	
					break;
					
				case Car.BACK_LEFT_TIRE:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					locationTire = car.changeTire(problemLocation, new HankookTire("뒤왼쪽", 14));	
					break;
					
				case Car.BACK_RIGHT_TIRE:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					locationTire = car.changeTire(problemLocation, new KumhoTire("뒤오른쪽", 17));		
					break;
			}
			
			System.out.println("-------------------------------------------------");
			
			if(problemLocation != Car.NORMAL_DRIVING && locationTire == -1) {
				System.out.printf("problemLocation(%d), locationTire(%d)\n", problemLocation, locationTire);
				System.out.println("타이어 교체를 하지 못했습니다.");
				System.out.println("더이상 차량을 운행할 수 없습니다.");
				System.out.println("차량 정비소에 연락하세요.");
				break;
			}
		}
		

	}

}
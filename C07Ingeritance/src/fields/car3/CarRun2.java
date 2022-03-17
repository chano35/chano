package fields.car3;

public class CarRun2 {
	static final int MAX_COUNT = 5;
	static Tire tires[] = {
		new HankookTire("앞왼쪽", 15),
		new KumhoTire("앞오른쪽", 13),
		new HankookTire("뒤왼쪽", 14),
		new KumhoTire("뒤오른쪽", 17)
	};

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int cnt = 1; cnt <= MAX_COUNT; cnt++) {
			int problemLocation = car.run(cnt);
			int locationTire = -1;
			
			if(problemLocation != Car.NORMAL_DRIVING) {
				locationTire = car.changeTire(problemLocation, tires[problemLocation-1]);
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
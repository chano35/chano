package fields.car3;

public class Car2 {
	static final int NORMAL_DRIVING = 0;
	static final int FRONT_LEFT_TIRE = 1;
	static final int FRONT_RIGHT_TIRE = 2;
	static final int BACK_LEFT_TIRE = 3;
	static final int BACK_RIGHT_TIRE = 4;
	
	private Tire[] tires = {
		new Tire("앞왼쪽 바퀴", 6),
		new Tire("앞오른쪽 바퀴", 2),
		new Tire("뒤왼쪽 바퀴", 3),
		new Tire("뒤오른쪽 바퀴", 4)
	};
	
	int changeTire(int locTire, Tire tire) { // 타이어 교체 메소드
		switch(locTire) {
		case FRONT_LEFT_TIRE:
			tires[0] = tire;
			return locTire;
		case FRONT_RIGHT_TIRE:
			tires[1] = tire;
			return locTire;
		case BACK_LEFT_TIRE:
			tires[2] = tire;
			return locTire;
		case BACK_RIGHT_TIRE:
			tires[3] = tire;
			return locTire;
		}
		
		return -1;
	}
	
	int run(int cnt) {
		System.out.printf("[자동차가 달림] %d\n", cnt);
		if(tires[0].roll() != true) { 
			stop(); 
			return FRONT_LEFT_TIRE; 
		};
		
		if(tires[1].roll() != true) { 
			stop(); 
			return FRONT_RIGHT_TIRE; 
		};
		
		if(tires[2].roll() != true) { 
			stop(); 
			return BACK_LEFT_TIRE; 
		};
		
		if(tires[3].roll() != true) { 
			stop();
			return BACK_RIGHT_TIRE; 
		};
		
		return NORMAL_DRIVING;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춤]");
	}	
}
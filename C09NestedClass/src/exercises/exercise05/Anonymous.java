package exercises.exercise05;

public class Anonymous {
	Vehicle field = new Vehicle() {
		@Override
		public void run() {
			System.out.println("field: 자전거가 달린다.");
		}
	};
	
	Vehicle field2 = new Bicycle();
	Vehicle field3 = new Bicycle();
	Vehicle field4 = new Bicycle();
	
			
	void method1() {	// 로컬 메소드
		Vehicle local = new Vehicle() {
			@Override
			public void run() {
				System.out.println("local: 승용차가 달린다.");
			}
		};
		
		local.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}

}
package people;

public class Woman extends People {
	int pregnancy;
	
	public Woman() {}
	
	public Woman(String name) {
		super(name);
	}
	
	void childbirth(int monthcount) {
		pregnancy += monthcount;
		
		if(pregnancy < 10) {
			System.out.printf("Woman: 산모(%s)는 아직 출산 예정일이 아닙니다.\n", this.name);
			return;
		}
		
		System.out.printf("Woman: 산모(%s)의 출산을 축하합니다.\n", this.name);
	}

}
package fields.car2;

public class Tire {
	public int maxRotation;     		// 최대 회전수(최대 수명)
	public int accumulatedRotation;		// 누적 회전수
	public String location;       		// 타이어의 위치

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	public boolean roll() {
		++accumulatedRotation;		
		if(accumulatedRotation < maxRotation) {
			int lifeCount = maxRotation - accumulatedRotation; // 남은 수명
			System.out.printf("타이어위치(%s), 남은 타이어 수명(%d)회\n", 
					location, lifeCount);
			return true;
		} 
		else {
			System.out.printf("타이어 %s가 수명을 다했습니다.\n", location);
			return false;
		}
	}		

}
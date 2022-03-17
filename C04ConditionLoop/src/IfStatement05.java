/*
 * [문제] 출근을 하는데 지갑에 들어 있는 현금에 따라서 교통편을 선택한다.
 * 택시 : 5000원 이상
 * 버스 : 2500원 이상
 * 전철 : 1500원 이상
 * 도보 : 1500원 미만
 */
public class IfStatement05 {
	
	public static void main(String[] args) {
		int money = 1550;
		
		if(money < 1500) {
			System.out.println("걸어간다.");
		}
		else if(money < 2500) {
			System.out.println("전철을 탄다.");
		}
		else if(money < 5000) {
			System.out.println("버스를 탄다.");
		}
		else {
			System.out.println("택시를 탄다.");
		}
	}

}
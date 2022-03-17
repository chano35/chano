/*
 * 스위치(switch): 조건 제어문
 * - case의 순서는 값의 크기의 순서와는 무관하지만
 *   가능하면 크기 순서로 기술하는 것이 가독성 좋다.
 */ 
public class SwitchStatement01A {

	public static void main(String[] args) {
		int num = 5;
		
		System.out.println("[SWITCH 문] num=" + num);
		switch(num) { // case의 값의 순서가 섞여서 이해가 난해
		case 2:
			System.out.println("값은 2이다.");
			break;
		case 1:
			System.out.println("값은 1이다.");
			break;
		default:
			System.out.println("디폴드가 실행: num="+ num);
			break;
		case 0:
			System.out.println("값은 0이다.");
			break;
		}
		
		System.out.println("SWITCH 문 종료");
		
	}
}
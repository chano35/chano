/*
 * 스위치(switch): 조건 제어문
 * switch(조건식) {
 * 	case 값1: 실행문; break;
 * 	case 값2: 실행문; break;
 * 	case 값3: 실행문; break;
 * 	case 값4: 실행문; break;
 *  default: 실행문; break;
 * }
 * --------------------------------
 * - 조건식 : 변수, 연산식 
 *   -> 정수타입(byte, char, short, int, long)
 *   -> 문자열(String)
 *   -> 속도는 정수가 문자열보다 빠르다.
 * - if문의 다른 형태
 * - 조건문의 결과가 여러일 때 보통 사용하면 유용
 * - case의 값으로 올 수 있는 것: 정수, 문자, 문자열
 * - default는 조건문에 해당하는 값이 일치하는 것이 없을 때 선택(옵션)
 * - break는 해당하는 실행문을 처리하고 case를 탈출(switch)문을 벗어나게 됨
 * - break를 쓰지 않으면 바로 밑에 기술된 case문으로 이동
 */
public class SwitchStatement01 {

	public static void main(String[] args) {
		int num = -1;
		
		System.out.println("[SWITCH 문]");
		switch(num) {
		case 0:
			System.out.println("값은 0이다.");
			break;
		case 1:
			System.out.println("값은 1이다.");
			break;
		case 2:
			System.out.println("값은 2이다.");
			break;
		default:
			System.out.println("디폴드가 실행: num="+ num);
			break;
		}

		System.out.println("[IF 문]");
		
		if(num == 0) {
			System.out.println("값은 0이다.");
		}
		else if(num == 1) {
			System.out.println("값은 1이다.");
		}
		else if(num == 2) {
			System.out.println("값은 2이다.");
		}
		else {
			System.out.println("ELSE가 실행: num="+ num);
		}
		

	}

}
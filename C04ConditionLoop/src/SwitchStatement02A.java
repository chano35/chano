/*
 * 스위치(switch): 조건 제어문
 */
public class SwitchStatement02A {

	public static void main(String[] args) {
		int num = (int)(Math.random() * 11); // 0부터 10까지 난수
		
		System.out.println("[SWITCH 문] num="+ num);
		
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
			
		case 3:
			System.out.println("값은 3이다.");
		case 4:
			System.out.println("값은 4이다.");
		case 5:
			System.out.println("값은 5이다.");
		case 6:
			System.out.println("값은 6이다.");
		case 7:
			System.out.println("값은 7이다.");
		case 8:
			System.out.println("값은 8이다.");
			break;
			
		// 여러 case에 해당하는 경우 하나의 처리(OR)
		// if(num == 9 || num == 10) {}
		case 9: 
		case 10:
			System.out.println("값은 9이거나 10이다.");
			break;
			
		default:
			System.out.println("해당사항 없음!");
			break;
		}
		
		System.out.println("[IF 문] num="+ num);
		if(num == 0) {
			System.out.println("값은 0이다.");
		}
		else if(num == 1) {
			System.out.println("값은 1이다.");
		}
		else if(num == 2) {
			System.out.println("값은 2이다.");
		}
		else if(num >= 3 && num <= 8) {
			if(num == 3) {
				System.out.println("값은 3이다.");
			}
			
			if(num == 3 || num == 4) {
				System.out.println("값은 4이다.");
			}
			
			if(num == 3 || num == 4 || num == 5) {
				System.out.println("값은 5이다.");
			}
			
			if(num == 3 || num == 4 || num == 5 || num == 6) {
				System.out.println("값은 6이다.");
			}

			if(num == 3 || num == 4 || num == 5 || num == 6 || num == 7) {
				System.out.println("값은 7이다.");
			}

			if(num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8) {
				System.out.println("값은 8이다.");
			}
		}
		else if(num == 9 || num == 10) {
			System.out.println("값은 9이거나 10이다.");
		}
		else {
			System.out.println("해당사항 없음!");
		}


	}

}

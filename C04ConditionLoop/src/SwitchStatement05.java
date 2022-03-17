/*
 * 스위치(switch): 조건 제어문
 * - 조건식 : 문자열(String)
 */
public class SwitchStatement05 {

	public static void main(String[] args) {
		float sw = 1.0f;
		int result = 0;
		
	 	// Cannot switch on a value of type float. 
		// Only convertible int values, strings or enum variables are permitted
		// switch(sw) { // sw는 float형이기 때문에 안된다.
		
		switch((int)sw) {
		case 1: result = (int)(100 * sw); break;
		case 2: result = (int)(200 * sw); break;
		case 3: 
			result = (int)(300 * sw);
			break;
		}
		
		System.out.printf("sw(%f), result(%d)\n", sw, result);
	}

}
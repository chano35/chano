/*
 * 논리연산자(!, ||, &&)
 * - 논리부정(!) : 반대, true -> false, false -> true
 * - 논리합(||)  : OR, A or B(A이거나 B이면 참, A, B중에 하나라도 참이면 참)
 * - 논리곱(&&)  : AND, A and B(A이고 B, A와 B가 모두 참이어야 참)
 */
public class LogicalOper {

	public static void main(String[] args) {
		boolean t = true;
		boolean f = false;
		
		// 논리부정
		boolean f1 = !t; // true -> false
		boolean t1 = !f; // false -> true;

		System.out.printf("t(%b) -> !t(%b)\n", t, f1); 
		System.out.printf("f(%b) -> !f(%b)\n", f, t1); 
		
		// [문제] true -> "켜짐", false -> "꺼짐" 
		// 삼항연산자 이용       
		// 토글(toggle) 스위치: 한 번 터치하면 상태가 반대로 바뀜, on -> off -> on -> off
		boolean onoff = false;
		System.out.printf("토글(toggle) 스위치: onoff(%b)(%s)\n", onoff, (onoff) ? "켜짐" : "꺼짐");
		onoff = !onoff;
		System.out.printf("토글(toggle) 스위치: onoff(%b)(%s)\n", onoff, (onoff == true) ? "켜짐" : "꺼짐");
		onoff = !onoff;
		System.out.printf("토글(toggle) 스위치: onoff(%b)(%s)\n", onoff, (onoff != true) ? "꺼짐" : "켜짐");
		onoff = !onoff;
		System.out.printf("토글(toggle) 스위치: onoff(%b)(%s)\n", onoff, (onoff != false) ? "켜짐" : "꺼짐");
		onoff = !onoff;
		System.out.printf("토글(toggle) 스위치: onoff(%b)(%s)\n", onoff, (onoff == false) ? "꺼짐" : "켜짐");
		
		// 논리부정으로 삼항연산자 비교
		System.out.println("논리부정으로 삼항연산자 비교");
		System.out.printf("토글(toggle) 스위치: onoff(%b)(%s)\n", onoff, !(onoff) ? "꺼짐" : "켜짐");
		onoff = !onoff;
		System.out.printf("토글(toggle) 스위치: onoff(%b)(%s)\n", onoff, !(onoff == true) ? "꺼짐" : "켜짐");
		onoff = !onoff;
		System.out.printf("토글(toggle) 스위치: onoff(%b)(%s)\n", onoff, !(onoff != true) ? "켜짐" : "꺼짐");
		onoff = !onoff;
		System.out.printf("토글(toggle) 스위치: onoff(%b)(%s)\n", onoff, !(onoff != false) ? "꺼짐" : "켜짐");
		onoff = !onoff;
		System.out.printf("토글(toggle) 스위치: onoff(%b)(%s)\n", onoff, !(onoff == false) ? "켜짐" : "꺼짐");
	}

}
/*
 * [문제]
 * 1. 각 월(1~12월)의 마지막 날짜를 출력하시오.
 * 2. switch문을 사용하라.
 * 3. 윤달을 적용하라. (29일)
 *    - 4년에 한 번 온다.
 *    - 100년 한 번 안 온다.
 *    - 400년 한 번 온다.
 */
public class ExerciseSW01C {

	public static void main(String[] args) {
		int year = 400;
		int month = 2;
		int day = 0;
		
		switch(month) {
		case 2:
			day = 28;
			if(year % 4 == 0) {
				if(year % 100 != 0 || year % 400 == 0) {
					day = 29;
				}
			}
			
			break;

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		}
		
		System.out.printf("(%d)년 (%d)월 (%d)일\n", year, month, day);
	}

}
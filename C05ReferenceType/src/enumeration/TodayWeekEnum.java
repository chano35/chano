/*
 * 날짜: 오늘
 * [문제] 요일을 상수형 처리
 */
package enumeration;

import java.util.Calendar;

public class TodayWeekEnum {
	final static int SUN = 1;
	final static int MON = 2;
	final static int TUE = 3;
	final static int WED = 4;
	final static int THU = 5;
	final static int FRI = 6;
	final static int SAT = 7;
	
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year  = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;  // 0:1월, 1:2월, ... 11:12월
		int day   = today.get(Calendar.DAY_OF_MONTH);
		int week  = today.get(Calendar.DAY_OF_WEEK);  // 1:일요일, 2:월요일, ... 7:토요일
		
		if(week == WED) {
			System.out.println("수요일은 가정의 날입니다.");
		}
	}

}
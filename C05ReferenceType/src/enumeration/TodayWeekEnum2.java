/*
 * 날짜: 오늘
 * [문제] 요일을 열거형으로 바꾸어서 처리하라.
 * - 열거형 : 영어, 한국어
 */
package enumeration;

import java.util.Calendar;

public class TodayWeekEnum2 {
	
	// final static String[] WEEKs = { "일", "월", "화", "수", "목", "금", "토" };

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year  = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;  // 0:1월, 1:2월, ... 11:12월
		int day   = today.get(Calendar.DAY_OF_MONTH);
		int week  = today.get(Calendar.DAY_OF_WEEK);  // 1:일요일, 2:월요일, ... 7:토요일
		
		System.out.printf("오늘은 (%d)년 (%d)월 (%d)일 (%d)\n", year, month, day, week);
		
		// 숫자로 되어있는 요일을 한글요일 변경(열거형)
		Week[] weeks = Week.values();
		System.out.printf("오늘은 (%d)년 (%d)월 (%d)일 (%s)\n",	year, month, day, weeks[week-1]);

		// 숫자로 되어있는 요일을 한글요일 변경(열거형)
		WeekKorean[] korweeks = WeekKorean.values();
		System.out.printf("오늘은 (%d)년 (%d)월 (%d)일 (%s)\n",	year, month, day, korweeks[week-1]);

		int ampm   = today.get(Calendar.AM_PM);		// 오전(0), 오후(1)
		int hour   = today.get(Calendar.HOUR);		// 시
		int minute = today.get(Calendar.MINUTE);	// 분
		int second = today.get(Calendar.SECOND);	// 초
		int millisecond = today.get(Calendar.MILLISECOND); // 밀리초(1000분에 1초)
		System.out.printf("지금 시간은 %s (%d)시 (%d)분 (%d)초 (%d)밀리초\n", 
				(ampm == 0) ? "오전" : "오후",  hour, minute, second, millisecond);
	}

}
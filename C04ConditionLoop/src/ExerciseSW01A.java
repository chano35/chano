//1. 각 월 (1~12월)의 마지막 날짜를 출력하시오
//2. switch문을 사용하라


public class ExerciseSW01A {
	
	public static void main (String ar[]) {
		int month = 9;
		int day = 0;
		
		switch(month) {
		case 2 : 
			day = 28;
			break;
		
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 9 :
		case 11 :
			
			day = 31;
			break;
			
		case 4 :
		case 6 :
		case 8 :
		case 10 :
		
			day = 30;
			break;						
		
		}
		
		System.out.printf("월(%d), 일(%d) \n" , month, day);
	}

}

package enumeration;

public class SeasonKoreanMain {

	public static void main(String[] args) {
		SeasonKorean season = SeasonKorean.가을;
		
		System.out.printf("season : (%s)\n", season.name());
		System.out.printf("season : (%s)\n", season.toString());
		System.out.printf("지금 계절은 '%s'이다\n", season.name());

		/*
		 * [ordinal]
		 * 선언되어 있는 열거상수의 순번 : 0부터 시작
		 * 봄(0), 여름(1), 가을(2), 겨울(3)
		*/	
		System.out.printf("ordinal : %d\n", season.ordinal()); // 가을(2)
		
		SeasonKorean spring = SeasonKorean.봄;
		SeasonKorean summer = SeasonKorean.여름;
		SeasonKorean autumn = SeasonKorean.가을;
		SeasonKorean winter = SeasonKorean.겨울;
		System.out.printf("spring ordinal : %d\n", spring.ordinal());
		System.out.printf("summer ordinal : %d\n", summer.ordinal());
		System.out.printf("autumn ordinal : %d\n", autumn.ordinal());
		System.out.printf("winter ordinal : %d\n", winter.ordinal());
		
		/*
		 * [values]
		 */
		SeasonKorean[] seasons1 = spring.values();
		System.out.println("[봄] spring object");
		// for(SeasonKorean ss : seasons1) {
		for(int cnt = 0; cnt < seasons1.length; cnt++) {
			SeasonKorean ss = seasons1[cnt];
			String name = seasons1[cnt].name();
			int ordinal = seasons1[cnt].ordinal();
			System.out.printf("name(%s)(%s), ordinal(%d)(%d)\n", 
					name, ss.name(), ordinal, ss.ordinal());
		}
		
		// 추천
		SeasonKorean[] seasons2 = SeasonKorean.values();
		System.out.println("[SeasonKorean]");
		for(SeasonKorean ss : seasons2) {
			System.out.printf("name(%s), ordinal(%d)\n", ss.name(), ss.ordinal());
		}
	}

}

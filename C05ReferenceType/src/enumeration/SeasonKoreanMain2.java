package enumeration;

public class SeasonKoreanMain2 {

	public static void main(String[] args) {
		SeasonKorean autumn = SeasonKorean.가을;
		SeasonKorean season = SeasonKorean.valueOf("가을");

		System.out.printf("season : (%s)(%s)\n", season.name(), autumn.name());
		System.out.printf("ordinal : (%d)(%d)\n", season.ordinal(), autumn.ordinal());
		System.out.printf("autumn == season ? :  %b\n", (autumn == season));

		// String strSeason = "봄가을"; 
		// java.lang.IllegalArgumentException: No enum constant enumeration.SeasonKorean.봄가을
		// SeasonKorean sa = SeasonKorean.valueOf(strSeason);
		// System.out.printf("봄가을 : (%s)(%d)\n", sa.name(), sa.ordinal());
		
		// SeasonKorean.valueOf("문자열")를 사용하지 않고 처리
		// strSeason : "봄", "여름", "가을", "겨울", 잘못된 문자열
		String strSeason = "봄가을"; 
		// String strSeason = "봄"; 
		// String strSeason = "여름";
		// String strSeason = "가을";
		// String strSeason = "겨울";
		SeasonKorean fourseason = null;
		
		switch(strSeason) {
		case "봄"  : fourseason = SeasonKorean.봄; break; 
		case "여름": fourseason = SeasonKorean.여름; break;
		case "가을": fourseason = SeasonKorean.가을; break;
		case "겨울": fourseason = SeasonKorean.겨울; break;
		}
		
		System.out.printf("사계절 : (%s)(%d)\n", 
				(fourseason != null) ? fourseason.name() : strSeason,
				(fourseason != null) ? fourseason.ordinal() : -1);
	}

}
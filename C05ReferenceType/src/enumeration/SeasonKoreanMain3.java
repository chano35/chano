package enumeration;

public class SeasonKoreanMain3 {

	public static void main(String[] args) {
		String[] leisure = {
				"봄에는 꽃 구경을 갑니다.",
				"여름에는 해수욕을 즐깁니다.",
				"가을에는 단풍 구경을 갑니다.",
				"겨울에는 스키를 탑니다."
		};
		SeasonKorean spring = SeasonKorean.valueOf("봄");
		SeasonKorean summer = SeasonKorean.valueOf("여름");
		SeasonKorean autumn = SeasonKorean.valueOf("가을");
		SeasonKorean winter = SeasonKorean.valueOf("겨울");

		System.out.printf("%s: %s\n", spring.name(), leisure[spring.ordinal()]); 
		System.out.printf("%s: %s\n", summer.name(), leisure[summer.ordinal()]); 
		System.out.printf("%s: %s\n", autumn.name(), leisure[autumn.ordinal()]); 
		System.out.printf("%s: %s\n", winter.name(), leisure[winter.ordinal()]); 
	}

}
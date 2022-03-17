/*
 * 스위치(switch): 조건 제어문
 * - 조건식 : 문자열(String)
 */
public class SwitchStatement03 {

	public static void main(String[] args) {
		// String area = "경기";
		String area = "서울";
		String areacd = "";
		
		switch(area) {
		case "서울":
			areacd = "02";
			break;
		case "대전":
			areacd = "042";
			break;
		case "부산":
			areacd = "051";
			break;
		case "경기":
			areacd = "031";
			break;
		}
		
		System.out.printf("전화국번: %s(%s)\n",  area, areacd);

	}

}
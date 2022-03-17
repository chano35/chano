/*
 * 스위치(switch): 조건 제어문
 * - 조건식 : 문자열(String)
 */
public class SwitchStatement03A {

	public static void main(String[] args) {
		String area = "부산";
		// String area = "경기";
		// String area = "서울";
		String areacd = "";
		
		switch(area) { // 자바7 이상
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
		
		// IF STATEMENT
		if(area.equals("서울")) {
			areacd = "02";
		}
		else if(area.equals("대전") == true) {
			areacd = "042";
		}
		else if(area.equals("부산") != false) {
			areacd = "051";
		}
		else if(area.equals("경기")) {
			areacd = "031";
		}

		System.out.printf("전화국번: %s(%s)\n",  area, areacd);
	}

}
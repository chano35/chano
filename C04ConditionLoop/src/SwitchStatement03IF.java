/*
 * 스위치(switch): 조건 제어문
 * - 조건식 : 문자열(String)
 * - IF문으로 변경하시오.
 */
public class SwitchStatement03IF {
	public static void main(String[] args) {
		String area = "051";
		String areaname = "";

		if (area.equals("02")) {
			areaname = "서울";
		} else if (area.equals("031")) {
			areaname = "경기";
		} else if (area.equals("042")) {
			areaname = "대전";
		} else if (area.equals("051")) {
			areaname = "부산";
		}

		System.out.printf("전화국번: (%s)(%s)\n", area, areaname);

	}

}

/*
 * 스위치(switch): 조건 제어문
 * - 조건식 : 문자열(String)
 */
public class SwitchStatement04 {

	public static void main(String[] args) {
		// String area = "부산";
		String area = "경기";
		// String area = "서울";
		String areacd = "";
		
		/*
		 * - case 문에서 선언된 변수는 다른 case에서도 사용할 수 있다.
		 */
		switch(area) { 
		case "서울": {
				areacd = "02";
				String telno = "007-0707";
				String name = "서울특별시";
				System.out.printf("[%s] %s-%s\n", area, areacd, telno);
				System.out.printf("[%s] %s-%s %s\n", area, areacd, telno, name);
			}
			break;
		case "대전": {
				areacd = "042";
				String telno = "007-04242";
				String name = "충청도";
				System.out.printf("[%s] %s-%s %s\n", area, areacd, telno, name);
			}
			break;
		case "부산": {
				areacd = "051";
				String telno = "007-5151";
				String name = "경상도";
				System.out.printf("[%s] %s-%s %s\n", area, areacd, telno, name);
			}
			break;
		case "경기": {
				areacd = "031";
				String telno = "007-3131";
				String name = "경기도";
				System.out.printf("[%s] %s-%s %s\n", area, areacd, telno, name);
			}
			break;
		}
		
		// telno는 case에서 선언된 지역변수로서 밖에서 참조할 수 없다.
		// System.out.printf("전화국번: %s(%s)(%s)\n",  area, areacd, telno);
	}

}
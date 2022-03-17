/*
 * 스위치(switch): 조건 제어문
 * - 조건식 : 문자열(String)
 */
public class SwitchStatement04A {

	public static void main(String[] args) {
		// String area = "부산";
		String area = "경기";
		// String area = "서울";
		String areacd = "";
		
		/*
		 * - case 문에서 선언된 변수는 다른 case에서도 사용할 수 있다.
		 */
		switch(area) { 
		case "서울":
			areacd = "02";
			String telno = "007-0707";
			System.out.printf("[%s] %s-%s\n", area, areacd, telno);
			// name은 다음(아래) case에서 선언되었으므로 접근할 수 없다.
			// System.out.printf("[%s] %s-%s %s\n", area, areacd, telno, name);
			break;
		case "대전":
			areacd = "042";
			// String telno = "007-04242";
			telno = "007-04242";
			String name = "충청도";
			System.out.printf("[%s] %s-%s %s\n", area, areacd, telno, name);
			break;
		case "부산":
			areacd = "051";
			// String telno = "007-5151";
			telno = "007-5151";
			name = "경상도"; // 위에 선언된 name을 사용하기 위해서는 초기화(값을 지정)해야 한다.
			System.out.printf("[%s] %s-%s %s\n", area, areacd, telno, name);
			break;
		case "경기":
			areacd = "031";
			// String telno = "007-3131";
			telno = "007-3131";
			System.out.printf("[%s] %s-%s\n", area, areacd, telno);
			break;
		}
		
		// telno는 case에서 선언된 지역변수로서 밖에서 참조할 수 없다.
		// System.out.printf("전화국번: %s(%s)(%s)\n",  area, areacd, telno);
	}

}
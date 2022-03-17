package numberformat;

public class NumberFormatRun {

	public static void main(String[] args) {
		String s1 = "100";
		
		int val1 = Integer.parseInt(s1); // 문자열을 정수(10진수) 변환
		System.out.printf("String(s1:\"%s\") -> int(val1:%d)\n", s1, val1);
		
		String s2 = "a100";
		
		// NumberFormatException 
		int val2 = Integer.parseInt(s2); // 문자열("a100")은 10진수로 변환할 수 없다.(a는 정수에 대응하지 않음) 
		System.out.printf("String(s2:\"%s\") -> int(val2:%d)\n", s2, val2);
		
	}

}
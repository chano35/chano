package exercises.exercise06;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String[] str = { "10", "2a" };
		int value = 0;
		
		for(int i=0; i <= 2; i++) { // 0, 1, 2
			try {
				value = Integer.parseInt(str[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 오류");
			}
			catch(NumberFormatException e) {
				System.out.println("숫자 변환 오류");
			}
			finally {
				System.out.println("finally:value=" + value);
			}
		}

	}

}
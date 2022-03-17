/*
 * 반복문(for)
 * ------------------------------
 * - 9번째 처리후의 값은 cnt(0.9000001)이므로
 *   10번째는 cnt(1.0000001)으로 1.0f 값을 넘어서서 9번만 수행한다.
 * - 반복회수는 정수형을 쓰는 것을 권고  
 * 
 */
public class ForStatement02 {

	public static void main(String[] args) {
		for(float cnt=0.1f; cnt <= 1.0f; cnt += 0.1f) {
			System.out.println("반복회수: cnt=" + cnt);
		}
		
	}

}
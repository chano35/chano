/*
 * c++ : scanf(const char * format, ...);
 * scanf("%d", &num);
 * scanf("%s", str);
 * 
 */
package exercise;

import java.util.Scanner;

public class Scanf {

	public static void main(String[] args) throws Exception {
		System.out.println("scanf examples");
		
		/*
		
		while(true) {
			System.out.print("종료(x);");
			int keyCode = System.in.read();
			if(keyCode == 'x') {
				break;
			}
		*/

		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.print("숫자입력: ");
		int num = scanner.nextInt();
		System.out.printf("입력값(숫자): %d\n", num);
		
		int keyCode = System.in.read();
		*/
		
		System.out.print("문장열입력: ");
		String str = scanner.nextLine();
		
		System.out.printf("입력값(문자열): %s\n", str);
		
	}

}
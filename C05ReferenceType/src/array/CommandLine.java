/*
 * 커멘드라인(command line):
 * - 프로그램이 실행될 때 진입함수(main)의 인자로 전달
 * - 인자는 문자열의 배열로 전달
 */
package array;

public class CommandLine {

	public static void main(String[] args) {
		System.out.println("args.length=" + args.length);
		for(String str : args) {
			System.out.printf("[%s]\n", str);
		}

		String[] abcs = { "홍길동", "30"};
		System.out.println("abcs.length=" + abcs.length);
		for(String str : abcs) {
			System.out.printf("[%s]\n", str);
		}
	}

}
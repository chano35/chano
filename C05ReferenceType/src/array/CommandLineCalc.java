/*
 * 커멘드라인(command line):
 * - 프로그램이 실행될 때 진입함수(main)의 인자로 전달
 * - 인자는 문자열의 배열로 전달
 * ------------------------------------------------
 * 1. 인자로 넘어 온 문자열을 숫자로 변환하여 모두 더함
 */
package array;

public class CommandLineCalc {

	public static void main(String[] args) {
		System.out.println("args.length=" + args.length);
		for(String str : args) {
			System.out.printf("[%s]\n", str);
		}
		
		int argslen = args.length;
		int total = 0;
		for(int cnt=0; cnt < argslen; cnt++) {
			int num = Integer.parseInt(args[cnt]); // 문자열 -> 정수로 변환
			total += num;
		}
		
		System.out.println("### total=" + total);
	}
}
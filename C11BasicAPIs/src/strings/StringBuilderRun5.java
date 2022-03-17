/*
 * StringBuilder: 스트링 생성 처리
 * ---------------------------------------------------------------------------
 * [문제] filepath에 저장된 문자열에서 폴더와 파일만 추출하여 출력
 * 조건 : filepath의 내용은 가변적이다. StringBuilder를 이용하라.
 */
package strings;

import java.util.StringTokenizer;

public class StringBuilderRun5 {

	public static void main(String[] args) {
		String filepath = "/usr/home/myaccount/workspace/abc.txt";
		// String filepath = "/usr/home/myaccount/workspace/abc.txt/";
		// String filepath = "/abc.txt";
		// String filepath = "abc.txt";
		// String filepath = "abc/";

		System.out.println("filepath: " + filepath);

		StringTokenizer st = new StringTokenizer(filepath, "/");
		int tokens = st.countTokens();

		System.out.println("countTokens: " + tokens);

		for(int cnt = 0; cnt < tokens; cnt++) {
			String filename = st.nextToken();
			System.out.printf("countTokens(%d), filename(%s)\n", st.countTokens(), filename);
		}
	}

}
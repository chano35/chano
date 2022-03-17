/*
 * Reader : 문자 기반 입력 스트림, 최상위 추상 클래스, 아래의 클래스의 부모 클래스
 *   - FileReader
 *   - BufferedReader
 *   - InputStreamReader
 *  --------------------------------------------------------------------------
 *  InputStreamReader:
 *   - 입력소스인 콘솔로부터 입력을 받아 문자기반으로 변환해 준다.
 */
package section03.substreams;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderRun {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);

		char[] buff = new char[125];

		System.out.println("아무키나 입력하세요(종료:Ctrl+Z)");

		while (true) {
			int len = reader.read(buff);
			if (len < 0) {
				break;
			}

			String data = new String(buff, 0, len);
			System.out.printf("data(%d):%s", len, data);
		}

		System.out.println("THE END.");
	}
}
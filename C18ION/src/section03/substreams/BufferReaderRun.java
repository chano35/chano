/*
 * BufferedReader:
 *   readLine() : 
 *     - CRLF 단위로 문자열을 읽음
 *     - CRLF는 자름 : 읽은 문자열에 포함되지 않음
 */
package section03.substreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferReaderRun {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:/Temp/test.txt");
		BufferedReader breader = new BufferedReader(reader);

		while (true) {
			String str = breader.readLine();
			if (str == null) { // 더 이상 읽은 내용이 없으면 null을 리턴
				break;
			}

			System.out.println(str);
		}

	}

}
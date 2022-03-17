/*
 * Reader : 문자 기반 입력 스트림, 최상위 추상 클래스, 아래의 클래스의 부모 클래스
 *   - FileReader
 *   - BufferedReader
 *   - InputStreamReader
 *  --------------------------------------------------------------------------
 *  InputStreamReader:
 *   - 입력소스인 콘솔로부터 입력을 받아 문자기반으로 변환해 준다.
 *  BufferedReader를 이용하여 CRLF 자름  
 */
package section03.substreams;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedInputStreamReaderRun {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("아무키나 입력하세요(종료:Ctrl+Z)");
		
		while(true) {
			String str = reader.readLine(); // CRLF 자름
			if(str == null) {
				break;
			}
			
			System.out.printf("data(%d):[%s]", str.length(), str);
			System.out.println();
		}
		
		System.out.println("THE END.");
	}
}
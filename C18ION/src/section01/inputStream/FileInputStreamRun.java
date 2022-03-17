/*
 * InputStream : 
 *  - 바이트 기반 입력 스트림의 최상위 추상 클래스
 *  - 기본 버퍼 크기 : DEFAULT_BUFFER_SIZE = 8192(8K)
 */
package section01.inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamRun {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:/Temp/test.txt");
		
		while(true) {
			int readByte = is.read(); // 1바이트씩 읽어서 int 리턴
			if(readByte == -1) {
				break;
			}
			
			System.out.print((char)readByte);
		}
		
		is.close();
	}

}

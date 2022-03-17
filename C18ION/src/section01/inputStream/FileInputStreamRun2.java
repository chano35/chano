/*
 * InputStream:
 * - 바이트 기반 입력 스트림의 최상위 추상 클래스
 * - 기본 버퍼 크기 : DEFAULT_BUFFER_SIZE = 8192(8KB)
 * - int 읽은바이트 = read(바이트배열)
 */
package section01.inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamRun2 {

	public static void main(String[] args) throws Exception {
		// InputStream is = new FileInputStream("D:/Temp/test.txt");
		InputStream is = new FileInputStream("D:\\Temp\\test-1.txt");
		
		byte[] readBytes = new byte[3];
		String data = "";
		
		while(true) {
			int readByte = is.read(readBytes); // 배열의 크기 만큼 읽고 읽은 크기를 리턴
			if(readByte == -1) {
				break;
			}
			
			String read = new String(readBytes, 0, readByte);
			System.out.printf("readByte(%d), read(%s)\n", readByte, read);
			
			data += read;
		}
		
		System.out.println("[data]");
		System.out.println(data);
		is.close();
	}

}
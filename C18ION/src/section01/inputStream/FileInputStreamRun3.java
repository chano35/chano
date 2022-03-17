/*
 * InputStream:
 * - 바이트 기반 입력 스트림의 최상위 추상 클래스
 * - 기본 버퍼 크기 : DEFAULT_BUFFER_SIZE = 8192(8KB)
 * ----------------------------------------------------
 * int 읽은바이트 = read(byte[] b, int off, int len)
 *    off : 배열의 상대적인 위치(읽은 데이터를 저장할 위치)
 *    len : 읽을 크기
 */
package section01.inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamRun3 {
	final static int MAX_READ_LEN = 8;
	final static int MAX_BUFF_LEN = 1024;

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:/Temp/test-2.txt");
		
		byte[] readBytes = new byte[MAX_BUFF_LEN];
		int off = 0;
		
		while(true) {
			int len = is.read(readBytes, off, MAX_READ_LEN);
			if(len == -1) {
				break;
			}
			
			off += len;
		}
			
		is.close();

		String data = new String(readBytes, 0, off);
		
		System.out.println("[data] len=" + off);
		System.out.println(data);
	}

}
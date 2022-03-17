/*
 * OutputStream:
 * - 바이트 기반 출력 스트림의 최상위 추상 클래스
 * - 기본 버퍼 크기 : DEFAULT_BUFFER_SIZE = 8192(8KB)
 * ----------------------------------------------------
 * int 출력바이트크기 = write(int b)
 * int 출력바이트크기 = write(byte[] b, int off, int len)
 *    off : 배열의 상대적인 위치(데이터를 출력할 위치)
 *    len : 읽을 크기
 * ----------------------------------------------------
 */
package section01.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamRun1 {
	final static String FILENAME = "D:/Temp/test-out-1.txt";

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream(FILENAME);

		byte[] data = "Hello, Java!".getBytes();

		for (int len = 0; len < data.length; len++) {
			os.write(data[len]);
		}

		os.flush();
		os.close();

		System.out.printf("filename(%s) write successful!!!", FILENAME);
	}

}

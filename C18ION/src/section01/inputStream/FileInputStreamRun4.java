/*
 * InputStream:
 * - 바이트 기반 입력 스트림의 최상위 추상 클래스
 * - 기본 버퍼 크기 : DEFAULT_BUFFER_SIZE = 8192(8KB)
 * ----------------------------------------------------
 * int 읽은바이트 = read(byte[] b, int off, int len)
 *    off : 배열의 상대적인 위치(읽은 데이터를 저장할 위치)
 *    len : 읽을 크기
 * ----------------------------------------------------
 * [문제]
 * - 배열의 크기를 1024바이트로 만들어 4바이트 단위로 읽어서 배열에 저장
 * - 읽은 데이터가 배열의 크기를 넘지 않도록 처리
 * - 읽는 과정을 출력
 * - 최종적으로 읽은 데이터와 크기를 출력
 * ----------------------------------------------------
 */
package section01.inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamRun4 {
	final static int MAX_READ_LEN = 4;
	final static int MAX_BUFF_LEN = 20;

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:/Temp/test-4.txt");

		byte[] readBytes = new byte[MAX_BUFF_LEN];
		int offset = 0;
		int readlen = MAX_READ_LEN;
		int bufflen = readBytes.length;

		while (offset < bufflen) {
			readlen = ((offset + readlen) > bufflen) ? bufflen - offset : MAX_READ_LEN;
			int len = is.read(readBytes, offset, readlen);
			if (len < 0) {
				break;
			}

			offset += len;
		}

		is.close();

		// String strData = new String(readBytes);
		String strData = new String(readBytes, 0, offset);

		System.out.printf("[data] offset(%d), strlen(%d) %n", offset, strData.length());
		System.out.println(strData);
	}

}

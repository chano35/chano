/*
 * [성능 향상 보조 스트림]
 *  메모리 버퍼에 파일을 미리 읽어서 처리하여 성능을 높임
 *   - BufferedInputStream
 *   - BufferedReader
 *  메모리 버퍼에 출력한 내용을 미리 넣고 쌓아서 처리하여 성능을 높임
 *   - BufferedOutputStream
 *   - BufferedWriter
 */
package section03.substreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamRun {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;

		// [버퍼 미사용]
		FileInputStream fis1 = new FileInputStream("D:/Temp/garden.png");
		start = System.currentTimeMillis();

		while (fis1.read() != -1) {
		}

		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않았을 때: " + (end - start) + "ms");
		fis1.close();

		// [버퍼사용]
		FileInputStream fis2 = new FileInputStream("D:/Temp/garden.png");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();

		while (bis.read() != -1) {
		}

		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용했을 때: " + (end - start) + "ms");
		bis.close();
		fis2.close();
	}

}
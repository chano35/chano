/*
 * Writer : 문자 기반 출력 스트림, 최상위 추상 클래스, 아래의 클래스의 부모 클래스
 *   - FileWriter
 *   - BufferedWriter
 *   - PrintWriter
 *   - OutputStreamWriter
 *  --------------------------------------------------------------------------
 *  OutputStreamWriter:
 *   - 출력소스인 바이트 기반의 FileOutputStream으로부터 출력 받아 문자기반으로 변환해서 출력해 준다.
 */
package section03.substreams;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterRun {

	public static void main(String[] args) throws Exception {
		FileOutputStream os = new FileOutputStream("D:/Temp/test.txt");
		Writer writer = new OutputStreamWriter(os);

		writer.write("이 예제는 FileOutputStream을 출력소스를 OutputStreamWriter으로 받아서\r\n");
		writer.write("문자기반으로 변환해서 출력해 준다\r\n");

		writer.flush();
		writer.close();

		System.out.println("THE END.");
	}
}
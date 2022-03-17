/*
 * FileReader, FileWriter
 * - 문자 기반 스트림
 * - 그림, 오디오, 비디오와 같은 파일을 읽을 수가 없다.(바이트 기반)
 * ------------------------------------------------------------------
 * FileWriter(filename, append)
 *  - append : true | false
 *  - true : 
 *    1. 파일이 존재하지 않으면 생성
 *    2. 파일이 존재하면 기존의 내용 뒤에 추가
 *  - false : 
 *   1. 파일이 존재하지 않으면 생성
 *   2. 파일이 존재하면 덮어 쓰기
 */
package section02.filereaderwriter;

import java.io.FileWriter;

public class FileWriterRun2 {
	final static String FILENAME = "D:/Temp/file-out-1.txt";

	public static void main(String[] args) {
		try {
			/*
			 * append : true
			 */
			boolean append = true;
			FileWriter filewriter = new FileWriter("D:/Temp/file-out-1.txt", append);

			filewriter.write("기존의 내용에 추가");
			filewriter.write("\r\n");

			filewriter.flush();
			filewriter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("파일생성 완료");
	}

}
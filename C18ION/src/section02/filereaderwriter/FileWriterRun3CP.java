/*
 * FileReader, FileWriter
 * - 문자 기반 스트림
 * - 그림, 오디오, 비디오와 같은 파일을 읽을 수가 없다.(바이트 기반)
 * ------------------------------------------------------------------
 * FileWriter(filename, append)
 * - append : true | false
 * - true : 
 *   1. 파일이 존재하지 않으면 생성
 *   2. 파일이 존재하면 기존의 내용 뒤에 추가
 * - false : 
 *   1. 파일이 존재하지 않으면 생성
 *   2. 파일이 존재하면 덮어 쓰기
 * ------------------------------------------------------------------
 * [문제]
 *  - 텍스트 파일 복사 기능
 *  - 원본 파일이 존재하는 확인
 *  - 복사될 대상 파일이 존재하면 대상 파일에 추가
 *  - 복사될 대상 파일이 존재하지 않으면 새로운 대상 파일을 생성 
 */
package section02.filereaderwriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterRun3CP {
	final static String INFILENAME = "D:/Temp/file-in-1.txt";
	final static String OTFILENAME = "D:/Temp/file-ot-1.txt";

	public static void main(String[] args) {
		if (existFile(INFILENAME) != true) {
			System.out.printf("(%s) 파일이 존재하지 않습니다.\n", INFILENAME);
			return;
		}

		try {
			FileReader filereader = new FileReader(INFILENAME);
			FileWriter filewriter = new FileWriter(OTFILENAME, true);

			char[] buff = new char[256];

			while (true) {
				int readlen = filereader.read(buff);
				if (readlen < 0) {
					break;
				}

				filewriter.write(buff, 0, readlen);
			}

			filereader.close();
			filewriter.flush();
			filewriter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		String sfilesize = checkFilesize(INFILENAME, OTFILENAME) ? "같다" : "틀리다";
		System.out.printf("checkFilesize: infile(%s)과 outfile(%s)의 크기는 (%s)\n", INFILENAME, OTFILENAME, sfilesize);
		System.out.printf("파일복사완료: (%s) -> (%s)\n", INFILENAME, OTFILENAME);
	}

	static boolean existFile(String filename) {
		File file = new File(filename);
		return file.exists();
	}

	static boolean checkFilesize(String infilename, String outfilename) {
		File inFile = new File(infilename);
		File outFile = new File(outfilename);

		long insize = inFile.length();
		long otsize = outFile.length();
		System.out.printf("checkFilesize: infile(%d), outfile(%d)\n", insize, otsize);

		return insize == otsize;
	}
}
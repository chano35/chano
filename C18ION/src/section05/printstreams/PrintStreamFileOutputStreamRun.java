/*
 * [PrintStream]
 *  프린터에 출력하는 것처럼 다양한 출력 소스에 결과를 보낼 수가 있다.
 *  - print(...)
 *  - println(...)
 *  - printf(...)
 */
package section05.printstreams;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class PrintStreamFileOutputStreamRun {

	public static void main(String[] args) throws Exception {
		FileOutputStream fileoutput = new FileOutputStream("D:/Temp/printstream.txt");
		PrintStream printer = new PrintStream(fileoutput);

		printer.println("[프린트 스트림]");
		printer.printf("이  름: %-10s\n", "홍길동");
		printer.printf("원주율: %.4f\n", Math.PI);

		Date now = new Date();

		printer.printf("오늘은: %tY년 %tm월 %td일\n", now, now, now);
		printer.printf("오늘은: %1$tY년 %1$tm월 %1$td일\n", now);
		printer.printf("시간은: %1$tH시 %1$tM분 %1$tS초\n", now);

		printer.flush();
		printer.close();
		fileoutput.close();

	}

}
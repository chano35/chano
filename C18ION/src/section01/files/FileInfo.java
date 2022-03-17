/*
 * File
 *  - 파일정보 : 파일이름, 파일크기, 파일속성
 *  - 파일생성, 파일삭제
 *  - 디렉토리 생성
 *  - 디렉토리 삭제
 *  - 디렉토리 정보
 */
package section01.files;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileInfo {

	public static void main(String[] args) throws Exception {
		File dir = new File("D:/Temp/NewDir");
		File file1 = new File("D:/Temp/NewDir/file1.txt");
		File file2 = new File("D:/Temp/NewDir/file2.txt");
		File file3 = new File(new URI("file:///D:/Temp/NewDir/file3.txt"));
		
		if(dir.exists() != true) { // 폴더생성  
			dir.mkdirs();  
		}
		
		if(file1.exists() != true) { // 파일생성 : file1.txt
			file1.createNewFile();  
		}
		
		if(file2.exists() != true) {  // 파일생성 : file2.txt
			file2.createNewFile();  
		}
		
		if(file3.exists() != true) { // 파일생성 : file3.txt
			file3.createNewFile();  
		}

		File filelists = new File("D:/Temp/NewDir");
		File[] contents = filelists.listFiles();	// 배열에 폴더에 있는 파일목록 리턴
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd   a   HH:mm");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("[%s]      [%s]  [%s] [%s]  [%s]     [%s]\n", 
				"날짜", "요일", "시간", "형태", "크기", "이름");
		System.out.println("-------------------------------------------------------------------");
		
		for(File file : contents) {
			System.out.printf("%-23s  %-6s %-10s %s\n",
					sdf.format(new Date(file.lastModified())),
					file.isDirectory() ? "<폴더>" : "<파일>",
					file.isDirectory() ? " " : file.length(),
					file.getName());
		}
	}
}
package section02.filereaderwriter;

import java.io.FileReader;

public class FileReaderRun {
	
	public static void main(String ar[]) {
		try {
			FileReader filereader = new FileReader("D:/Temp/file-1.txt");
			char[] charbuff = new char[125];
			
			while(true) {
				int readlen = filereader.read(charbuff);
				if(readlen < 0) {
					break;
				}
				
				String str = new String(charbuff, 0, readlen);
				System.out.printf(str);
			}
		}
		catch(Exception e) {
		}
	}

}

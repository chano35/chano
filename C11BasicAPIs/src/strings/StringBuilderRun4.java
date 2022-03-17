/*
 * StringBuilder: 스트링 생성 처리
 * ---------------------------------------------------------------------------
 * [문제] filepath에 저장된 문자열에서 폴더와 파일만 추출하여 출력
 * 조건 : filepath의 내용은 가변적이다. StringBuilder를 이용하라.
 */
package strings;

public class StringBuilderRun4 {

	public static void main(String[] args) {
		// StringBuilder filepath = new StringBuilder("/usr/home/myaccount/workspace/abc.txt");
		// StringBuilder filepath = new StringBuilder("/usr/home/myaccount/workspace/abc.txt/");
		// StringBuilder filepath = new StringBuilder("/abc.txt");
		// StringBuilder filepath = new StringBuilder("abc.txt");
		// StringBuilder filepath = new StringBuilder("");
		StringBuilder filepath = new StringBuilder("abc/");
		
		System.out.println("filepath: " + filepath);
	
		int filelen = filepath.length();
		int fromIndex = filepath.indexOf("/", 0) + 1;
		
		System.out.printf("filelen(%d), fromIndex(%d)\n", filelen, fromIndex);
		if(filelen > 0 && fromIndex < 1) {
			fromIndex = 0;
		}
		
		if(filelen > 0 && fromIndex == filelen) { // "abc/"
			String filename = filepath.substring(0, fromIndex - 1);
			System.out.println("filename=" + filename);
		}
		
		while(filelen > 0 && fromIndex >= 0 && fromIndex < filelen) {
			int filepos = filepath.indexOf("/", fromIndex);
			
			System.out.printf("fromIndex(%d), filepos(%d)\n", fromIndex, filepos);
			
			if(filepos < 0) {
				if(fromIndex < filelen) {
					String filename = filepath.substring(fromIndex);
					System.out.println("filename=" + filename);
				}
				break;
			}
			
			String filename = filepath.substring(fromIndex, filepos);
			System.out.println("filename=" + filename);
			fromIndex = filepos + 1;
		}
	}

}
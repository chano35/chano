/*
 * StringBuilder: 스트링 생성 처리
 * 1. StringBuilder: 단일 스레드 환경에서 사용할 수 있는 클래스
 * 2. StringBuffer: 멀티 스레드 환경에서 사용할 수 있도록 동기화가 적용된 클래스
 * 3. String: 저장된 문자열을 수정할 수 없다.
 */
package strings;

public class StringBuilderRun3 {

	public static void main(String[] args) {
		StringBuilder filepath = new StringBuilder("c:\\usr\\home\\myaccount\\workspace\\abc.txt");
		System.out.println(filepath);
	
		int filepos = filepath.lastIndexOf("\\");
		System.out.println("filepos=" + filepos);
	
		String filename = filepath.substring(filepos+1);
		System.out.println("filename=" + filename);

		// 파일이 포함된 폴더이름 : "workspace"
		int folderpos = filepath.lastIndexOf("\\", filepos - 1);
		System.out.println("folderpos=" + folderpos);
	
		String foldername = filepath.substring(folderpos+1, filepos);
		System.out.println("foldername=" + foldername);
	}

}
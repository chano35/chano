package userexception;

public class FileInputStreamRun {

	public static void main(String[] args) {
		FileInputStream fileinput = new FileInputStream("abc.txt");
		// FileInputStream fileinput = new FileInputStream();
		// FileInputStream fileinput = new FileInputStream("");
		
		try {
			fileinput.open();

			// 입력예외: 입력크기 오류(readsize:0)
			fileinput.read(0); 

			for(int readcnt=0; readcnt < 4; readcnt++) {
				int readsize = fileinput.read(300);
				System.out.printf("read: cnt(%d) size(%d)\n", readcnt, readsize);
			}
			
			// 입력예외: 더이상 읽을 내용이 없음(filesize:0)
			// fileinput.read(300); 
			
			System.out.println("파일읽기 완료");
		}
		catch(FileInputUserException e) {
			System.out.println("FileInputUserException: 파일처리 도중 예외 발생");
			System.out.println("FileInputUserException: " + e.getMessage());
		}
		finally {
			if(fileinput != null) {
				try {
					fileinput.close();
					
					// 닫기예외: 파일(abc.txt)은 이미 닫혀있습니다.
					// fileinput.close();
				}
				catch(FileInputUserException e) {
					System.out.println("FileInputUserException: 파일닫기 예외 발생");
					System.out.println("FileInputUserException: " + e.getMessage());
				}
			}
		}
		
		System.out.println("파일 처리 완료");
	}
}
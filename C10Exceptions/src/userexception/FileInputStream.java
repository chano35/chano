/*
 * 자동리소드 닫기:
 * public interface AutoCloseable {
 * 		void close() throws Exception;
 * }
 * 
 * 1. AutoCloseable 인터페이스의 구현 클래스를 작성하면
 *    자동으로 close() 메소드가 호출되도록 할 수 있다.
 * 2. try-with-resource     
 */
package userexception;

public class FileInputStream {
	private String filename;
	private int filesize;
	private boolean closed = true;
	
	FileInputStream() {
	}
	
	FileInputStream(String filename) {
		this.filename = filename;
		this.filesize = 1000;
		this.closed = true;
	}
	
	public void open() throws FileInputUserException {
		System.out.printf("[open] filename(%s)\n", this.filename);
		
		if(this.filename == null || this.filename.isEmpty()) {
			throw new FileInputUserException("열기예외: 파일이름이 없습니다.");
		}
		
		closed = false;
	}
	
	public int read(int readsize) throws FileInputUserException {
		// System.out.printf("filename(%s) read\n", this.filename);
		if(readsize <= 0) {
			String msg = String.format("입력예외: 입력크기 오류(readsize:%d)", readsize);
			throw new FileInputUserException(msg);
		}
		
		if(this.filesize <= 0) {
			String msg = String.format("입력예외: 더이상 읽을 내용이 없음(filesize:%d)", this.filesize);
			throw new FileInputUserException(msg);
		}
		
		readsize = (this.filesize > readsize) ? readsize : this.filesize;
		this.filesize -= readsize;
		
		return readsize;
	}
	
	// @Override
	public void close() throws FileInputUserException {
		System.out.printf("[close] filename(%s) closed(%b)\n", this.filename, this.closed);
		if(this.closed != false) {
			String msg = String.format("닫기예외: 파일(%s)은 이미 닫혀있습니다.", this.filename);
			throw new FileInputUserException(msg);
		}
		
		closed = true;
	}

}
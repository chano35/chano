package userexception;

public class FileInputRuntimeException extends RuntimeException {
	private int filestatus;
	
	public FileInputRuntimeException() {}
	
	public FileInputRuntimeException(String message) {
		super(message);
	}
	
	public FileInputRuntimeException(String message, int filestatus) {
		super(message);
		this.filestatus = filestatus;
	}
	
	public int getFileStatus() {
		return this.filestatus;
	}
}
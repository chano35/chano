package section01.exercises;

public class Progress {
	private int step;
	private String status; // "시작", "진행", "종료", "오류"
	private String msg;
	private String error;

	public Progress() {
	}

	public Progress(String status, String msg, String error) {
		this.status = status;
		this.msg = msg;
		this.error = error;
	}

	public Progress(int step, String status, String msg, String error) {
		this.step = step;
		this.status = status;
		this.msg = msg;
		this.error = error;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
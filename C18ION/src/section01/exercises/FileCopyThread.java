package section01.exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.Consumer;

public class FileCopyThread extends Thread {
	final static int MAX_BUFF_SIZE = 256;

	private byte[] readBytes = new byte[MAX_BUFF_SIZE];
	private String srcfilename;
	private String tarfilename;

	InputStream is;
	OutputStream os;

	Consumer<Progress> progress;

	public FileCopyThread(String srcfilename, String tarfilename) {
		this.srcfilename = srcfilename;
		this.tarfilename = tarfilename;
	}

	public void setProgress(Consumer<Progress> progress) {
		this.progress = progress;
	}

	@Override
	public void run() {
		try {
			is = new FileInputStream(srcfilename);
			os = new FileOutputStream(tarfilename);

			if (this.progress != null) {
				this.progress.accept(new Progress("시작", "파일 오픈 성공", ""));
			}

			int step = 0;

			while (true) {
				int len = is.read(readBytes);
				if (len < 0) {
					break;
				}

				os.write(readBytes, 0, len);

				// 버퍼를 비움
				// 물리적 파일에 반영
				// 성능이 저하
				// os.flush();

				step++;

				if (this.progress != null) {
					this.progress.accept(new Progress(step, "진행", "파일 복사 중...", ""));
				}

				// Thread.sleep(500);
			}
			is.close();

			os.flush(); // 버퍼를 비움
			os.close();

			if (this.progress != null) {
				this.progress.accept(new Progress("종료", "파일 닫기 성공", ""));
			}
		} catch (Exception e) {
			// System.out.printf("[FileCopyThread] : Exception (%s)\n", e.getMessage());
			if (this.progress != null) {
				this.progress.accept(new Progress("오류", "", e.getMessage()));
			}
		}
	}
}
/*
 * [문제]
 *  - 파일 복사
 *  - FileInputStream, FileOutputStream을 이용하여 파일을 복사하는 기능을 수행
 *  - 클래스 : FileCopyThread
 *      > 파일읽기 쓰기 버퍼를 파라미터로 지정
 *      > 파일읽기 버퍼 크기를 지정 가능 : 최대 256바이트
 *      > 파일쓰기 버퍼 크기를 지정 가능 : 최대 512바이트
 *      > 스레드로 처리
 *      > 진행상황을 호출 클래스에 통보
 *  - 호출할 클래스는 복사가 끝날 때까지 기다림      
 */
package section01.exercises;

public class FileCopyRun2 {
	final static String SRCFILENAME = "D:/Temp/house.jpg";
	final static String TARFILENAME = "D:/Temp/house-1.jpg";

	public static void main(String[] args) {

		FileCopyThread filecopy = new FileCopyThread(SRCFILENAME, TARFILENAME);
		filecopy.setProgress(t -> {
			switch (t.getStatus()) {
			case "오류":
				System.out.printf("복사실패 : status[%s], error[%s] %n", t.getStatus(), t.getError());
				break;

			default:
				System.out.printf("파일카피 : step[%d], status[%s], msg[%s] %n", t.getStep(), t.getStatus(), t.getMsg());
				break;
			}
		});

		filecopy.start();

		try {
			filecopy.join();
		} catch (InterruptedException e) {
		}

		System.out.printf("filecopy : (%s) -> (%s)\n", SRCFILENAME, TARFILENAME);
	}

}
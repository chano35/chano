/*
 * 백터(Vector)
 * - ArrayList와 동일한 구조
 * - 쓰레드 안전(Thread Safe) 지원
 * - 동기화 메소드로 구성(synchronized)
 */
package vectors;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class BoardVector {

	public static void main(String[] args) {
		List<Board> boards = new Vector<>();

		boards.add(new Board("공지시항1", "인사발령", "총무팀"));
		boards.add(new Board("공지시항2", "연말보너스", "총무부"));
		boards.add(new Board("공지시항3", "특별수당", "인사팀"));
		boards.add(new Board("공지시항4", "새해선물", "경영지원팀"));
		
		printBoard(boards);
	}
	
	static void printBoard(List<Board> boards) {
		System.out.println("[게시판]");
		
		Iterator<Board> it = boards.iterator();
		while(it.hasNext()) {
			Board board = it.next();
			System.out.println("제  목: " + board.subject);
			System.out.println("내  용: " + board.content);
			System.out.println("작성자: " + board.writer);
			System.out.println("-------------------------");
		}
		
	}

}
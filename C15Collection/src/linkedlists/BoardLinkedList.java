/*
 * LinkedList
 * - 이중 연결 리스트
 * - 객체의 삽입과 삭제가 빈번한 형태에서 유용
 * - 장점: 추가, 삭제가 빠르다.
 */
package linkedlists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class BoardLinkedList {

	public static void main(String[] args) {
		List<Board> boards = new LinkedList<>();

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
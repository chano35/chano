/*
 * 큐(Queue)
 *  - FIFO (First In First Out)
 *  - 선입선출 : 먼저 들어온 것이 먼저 나감
 *  - 사용예 : 작업큐(대기줄), 메시지큐(마우스, 키보드)
 */

package queues;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueRun {
	
	public static void main (String ar[]) {
		Queue<Message> messages = new LinkedList<Message>();
		
		//큐에 메시지를 넣음
		messages.offer(new Message("준비", "주동현"));
		messages.offer(new Message("시작", "가민지"));
		messages.offer(new Message("작업", "권철주"));
		messages.offer(new Message("이동", "김영우"));
		messages.offer(new Message("종료", "관리자"));
		
		pollMessages(messages);
	}
		static void pollMessages(Queue<Message> messages) {
			while(messages.isEmpty() != true) {
				Message message = messages.poll();
				
				switch(message.command) {
				case "준비" :
					System.out.printf("[준비] command=%s, to=%s %n", message.command, message.to);
					break;
				case "시작" :
					System.out.printf("[시작] command=%s, to=%s %n", message.command, message.to);
					break;
				case "작업" :
					System.out.printf("[작업] command=%s, to=%s %n", message.command, message.to);
					break;
				case "이동" :
					System.out.printf("[이동] command=%s, to=%s %n", message.command, message.to);
					break;
				case "종료" :
					System.out.printf("[종료] command=%s, to=%s %n", message.command, message.to);
					break;
				
				}
			}
		
	}

}





package exercises.exercise06;

public class Chatting {

	class Chat {
		void start() {}
		void send(String msg) {
			System.out.println("Chat: " + msg);
		}
	}
	
	void start(String id) {
		// String nickName = null;
		// nickName = charId;
		// String nickName = "이젠쳇";
		final String nickName = "이젠쳇";
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				String input = "안녕!";
				String msg = String.format("[%s] %s:%s", id, nickName, input);
				send(msg);
			}
		};
		
		chat.start();
	}	

	Chat create(String id) {
		// final String nickName = "메신저";
		String nickName = "메신저";
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				String input = "안녕!";
				String msg = String.format("[%s] %s:%s", id, nickName, input);
				send(msg);
			}
		};
		
		// chat.start();
		return chat;
	}	

}
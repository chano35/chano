package exercises.exercise06;

public class ChattingRun2 {

	public static void main(String[] args) {
		Chatting chatting = new Chatting();
		chatting.start("EZEN");
		
		Chatting.Chat chatx = chatting.create("messenger");
		chatx.start();
	}

}
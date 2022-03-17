package abstracts;

public class Content {
	String content;
	
	public Content() {}
	public Content(String content) {
		this.content = content;
	}
	
	public String toString() {
		return "[Content] " + this.content;  
	}
	

}
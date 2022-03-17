package section06;

public class Member {
	private String name;
	private String id;
	
	public Member() {
		System.out.println("Member() 객체 생성");
	}
	
	public Member(String id) {
		System.out.println("Member(String id) 객체 생성");
		this.id = id;
	}
	
	public Member(String name, String id) {
		System.out.println("Member(String name, String id) 객체 생성");
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
}
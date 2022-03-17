package section06.objectstreams;

public class Child extends Parent {
	public String cname;

	public Child() {
	}

	public Child(String cname) {
		super(cname + "의 부모");
		this.cname = cname;
	}

}
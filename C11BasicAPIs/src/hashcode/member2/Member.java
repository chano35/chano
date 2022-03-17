/*
 * 1. 자바의 클래스는 기본적으로 Object를 상속한다.
 * 2. public class Member extends Object
 * -------------------------------------------------
 * 1. Object의 메소드 equals()을 오버라이드해서
 *    객체의 필드값으로 객체를 비교할 수 있다.
 */
package hashcode.member2;

public class Member {
	private String id;
	private int age;
	
	public Member(String id, int age) {
		this.id = id;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.id.equals(member.id) && this.age == member.age) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String str = String.format("Member:id(%s)", this.id);
		return str;
	}

}
/*
 * 1. 자바의 클래스는 기본적으로 Object를 상속한다.
 * 2. public class Member extends Object
 */
package hashcode.member;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(id.equals(member.id)) {
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
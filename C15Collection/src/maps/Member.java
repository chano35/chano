/*
 * 동일한 객체인지 인식하는 매커니즘
 * 아래의 hashCode()의 리턴값과 equals()의 리턴값이 같아야 같은 객체로 인식
 * 1. hashCode()의 리턴값
 * 2. equals()의 리턴값
 * ------------------------------------------------------------------
 * id와 name이 같으면 같은 객체로 처리
 */
package maps;

public class Member {
	
	int id;
	String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id + this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return this.id == member.id && (this.name.equals(member.name));
		}
		return false;
	}
	
	

}

/*
 * 1. 자바의 클래스는 기본적으로 Object를 상속한다.
 * 2. public class Member extends Object
 * -------------------------------------------------
 * 1. Object의 메소드 equals()을 오버라이드해서
 *    객체의 필드값으로 객체를 비교할 수 있다.
 * -------------------------------------------------
 * [객체 비교 처리 순서]
 * 1. hashCode()
 * 2. equals()
 * 3. hashCode && equals 참이어야 같은 객체로 인식
 * --------------------------------------------------
 *  [해시코드] 
 * 1. 객체의 메모리 번지를 이용해서 해시코드를 만들어 관리하기 때문에
 *    객체마다 다른 값을 가진다.
 * 2. 자바객체를 식별하는 키   
 */
package hashcode.member3;

public class Member {
	private static int hashCount = 0; 
	private String id;
	private int age;
	private int hashcode;
	
	public Member(String id, int age) {
		this.id = id;
		this.age = age;
		this.hashcode = ++hashCount;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			if(this.hashCode() == obj.hashCode()) {
				Member member = (Member)obj;
				if(this.id.equals(member.id) && this.age == member.age) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		String str = String.format("Member:id(%s), hashCode(%d)",
				this.id, this.id.hashCode());
		return str;
	}
	
	@Override
	public int hashCode() {
		return this.hashcode;
	}
}
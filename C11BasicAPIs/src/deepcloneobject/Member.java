/*
 * 복제(clone) :
 * 1. 객체를 복제하기 위해서는 Cloneable 인터페이스의 구현 클래스를 정의해야 한다.
 * 2. Object.clone() 메소드를 사용
 * 3. CloneNotSupportedException 예외를 처리
 * ---------------------------------------------
 * (Object)
 * public interface Cloneable {
 * }
 */
package deepcloneobject;

public class Member implements Cloneable {
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public void change(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member cloneMember2() {
		Member member = new Member(this.id, this.name, this.password, this.age, this.adult);
		member.setCashPoint(this.cashPoint);
		return member;
	}
	
	public void setCashPoint(CashPoint cashPoint) {
		this.cashPoint = cashPoint;
	}
	
	/*
	 * [얕은 복사]
	 * 1. 기본타입은 값을 복사
	 * 2. 참조타입은 주소를 복사
	 *    - 복제된 객체에서 동일한 객체를 공유
	 */
	public Member cloneMember() throws CloneNotSupportedException {
		return (Member)clone();
	}

	/*
	 * [깊은복사]
	 * 1. 참조형은 개별적으로 복사
	 */
	public Member deepCloneMember() throws CloneNotSupportedException {
		Member member = (Member)clone();
		member.cashPoint = new CashPoint();
		
		System.arraycopy(this.cashPoint.getCash(), 0, 
				member.cashPoint.getCash(), 0, 
				this.cashPoint.getCash().length);
		
		return member;
	}


	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public CashPoint cashPoint = new CashPoint(new int[] {10, 20, 30});

}
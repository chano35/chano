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
package deepcloneobject2;

public class Member implements Cloneable {
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member(String id, String name, String password, int age, boolean adult, CashPoint cashPoint) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.cashPoint = cashPoint;
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
	 * [얕은복사]
	 */
	public Member cloneMember() throws CloneNotSupportedException {
		return new Member(this.id, this.name, this.password, this.age, this.adult, this.cashPoint);
	}

	/*
	 * [깊은복사]
	 * 1. 필드 객체들이 clone() 오버라이드를 해서 각 필드 객체에서 깊은 복사처리
	 * 2. 참조형은 개별적으로 복사
	 */
	public Member deepCloneMember() throws CloneNotSupportedException {
		return (Member)clone();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member member = (Member)super.clone();
		member.cashPoint = (CashPoint)this.cashPoint.clone();
		// member.cashPoint = (CashPoint)this.cashPoint.clone2();
		return member;
	}

	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public CashPoint cashPoint = new CashPoint(new int[] {10, 20, 30});

}
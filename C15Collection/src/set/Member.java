//돌일한 객체인지 인식하는 매커니즘
//아래의 hashCode()의 리턴값과 equals()의 리턴값이 같아야 같은 객체로 인식
//1. hashCode()의 리턴값
//2. equals()의 리턴값

package set;

public class Member {
	String name;
	int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		int hashcode = this.name.hashCode() + this.age;
		System.out.printf("[Member] [%s] hashCode: name(%d) -> (%d)\n", this.name, this.name.hashCode(), hashcode);
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(this.name) && (member.age == this.age);
		}
		return false;
	}
}

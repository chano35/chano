/*
 * 객체 직렬화(Serializable)
 *  - 직렬화의 대상은 속성(멤버 필드)
 */
package section06.objectstreams;

import java.io.Serializable;

public class Parent implements Serializable {
	public String pname;

	public Parent() {
	}

	public Parent(String pname) {
		this.pname = pname;
	}
}
/*
 * 객체 직렬화(Serializable)를 하지 않음
 */
package section06.objectstreams;

public class ParentNoSerializable {
	public String pname;

	public ParentNoSerializable() {
	}

	public ParentNoSerializable(String pname) {
		this.pname = pname;
	}
}
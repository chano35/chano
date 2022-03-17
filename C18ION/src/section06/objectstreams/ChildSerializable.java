/*
 * 상속 받은 부모가 직렬화가 되어 있지 않으면
 * writeObject(), readObject()를 직접 구현해야 한다.
 */
package section06.objectstreams;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ChildSerializable extends ParentNoSerializable implements Serializable {
	public String cname;

	public ChildSerializable() {
	}

	public ChildSerializable(String cname) {
		super(cname + "의 부모");
		this.cname = cname;
	}

	// 직렬화
	private void writeObject(ObjectOutputStream os) throws IOException {
		os.writeUTF(pname); // 부모 필드
		os.defaultWriteObject(); // 자기 자신의 모든 필드
	}

	// 역직렬화
	private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException {
		pname = is.readUTF(); // 부모 필드
		is.defaultReadObject(); // 자기 자신의 모든 필드
	}

}
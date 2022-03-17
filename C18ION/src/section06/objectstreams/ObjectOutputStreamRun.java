/*
 * [ObjectOutputStream]
 *  자바의 객체 출력 보조 스트림
 *  - writeObject(Object)
 */
package section06.objectstreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamRun {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("D:/Temp/JavaObject.dat"));

		os.writeObject(new String("자바 객체 저장"));
		os.writeObject(new Double(1.8));
		os.writeObject(new Float(3.14f));
		os.writeObject(new Integer(1234));
		os.writeObject(new String("종료"));

		os.flush();
		os.close();

		System.out.println("자바 객체 저장 완료");
	}

}
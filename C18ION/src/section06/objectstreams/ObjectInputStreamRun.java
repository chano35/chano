/*
 * [ObjectInputStream]
 *  자바의 객체 입력 보조 스트림
 *  - readObject()
 *  - 사용예:
 *    객체타입 객체 = (객체타입)readObject();
 */
package section06.objectstreams;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamRun {

	public static void main(String[] args) throws Exception {
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("D:/Temp/JavaObject.dat"));

		String s1 = (String) is.readObject();
		double d1 = (Double) is.readObject();
		float f1 = (Float) is.readObject();
		int n1 = (Integer) is.readObject();
		String s2 = (String) is.readObject();

		System.out.println(s1);
		System.out.println(d1);
		System.out.println(f1);
		System.out.println(n1);
		System.out.println(s2);

		is.close();
	}

}
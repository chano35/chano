/*
 * [DataInputStream]
 * 자바 기본타입(primitive type) 출력
 * - boolean : readBoolean()
 * - byte    : readByte()
 * - char    : readChar()
 * - double  : readDouble()
 * - float   : readFloat()
 * - int     : readInt()
 * - long    : readLong()
 * - short   : readShort()
 * - String  : readUTF()
 * 
 */
package section04.datastreams;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamRun {

	public static void main(String[] args) throws Exception {
		DataInputStream is = new DataInputStream(new FileInputStream("D:/Temp/JavaPrimitive.data"));

		String s1 = is.readUTF();
		double d1 = is.readDouble();
		float f1 = is.readFloat();
		int n1 = is.readInt();
		String s2 = is.readUTF();

		System.out.println(s1);
		System.out.println(d1);
		System.out.println(f1);
		System.out.println(n1);
		System.out.println(s2);

		is.close();
	}

}
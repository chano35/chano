/*
 * [DataOutputStream]
 * 자바 기본타입(primitive type) 출력
 * - boolean : writeBoolean(boolean v)
 * - byte    : writeByte(int v)
 * - char    : writeChar(int v)
 * - double  : writeDouble(double v)
 * - float   : writeFloat(float v)
 * - int     : writeInt(int v)
 * - long    : writeLong(long v)
 * - short   : writeShort(int v)
 * - String  : writeUTF(String str)
 * 
 */
package section04.datastreams;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamRun {

	public static void main(String[] args) throws Exception {
		DataOutputStream os = new DataOutputStream(new FileOutputStream("D:/Temp/JavaPrimitive.data"));

		os.writeUTF("자바 기본형 저장");
		os.writeDouble(1.8);
		os.writeFloat(3.14f);
		os.writeInt(1234);
		os.writeUTF("종료");

		os.flush();
		os.close();

		System.out.println("자바 기본형 저장 테스트 완료");
	}

}
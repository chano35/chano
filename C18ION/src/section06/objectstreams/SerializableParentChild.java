package section06.objectstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableParentChild {

	public static void main(String[] args) throws Exception {
		save();
		load();
	}

	public static void save() throws Exception {
		FileOutputStream os = new FileOutputStream("D:/Temp/child-object.dat");
		ObjectOutputStream writer = new ObjectOutputStream(os);

		writer.writeObject(new Child("홍길동"));
		writer.close();
		os.close();

		System.out.println("Child 객체 저장");
	}

	public static void load() throws Exception {
		FileInputStream is = new FileInputStream("D:/Temp/child-object.dat");
		ObjectInputStream reader = new ObjectInputStream(is);

		Child child = (Child) reader.readObject();

		System.out.println("> 로드데이터:부모이름=" + child.pname);
		System.out.println("> 로드데이터:자식이름=" + child.cname);

		reader.close();
		is.close();
		System.out.println("Child 객체 로드");
	}

}
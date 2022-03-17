package section06.objectstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableParent {

	public static void main(String[] args) throws Exception {
		save();
		load();
	}

	public static void save() throws Exception {
		FileOutputStream os = new FileOutputStream("D:/Temp/parent-object.dat");
		ObjectOutputStream writer = new ObjectOutputStream(os);

		writer.writeObject(new Parent("나는 부모다."));
		writer.close();
		os.close();

		System.out.println("Parent 객체 저장");
	}

	public static void load() throws Exception {
		FileInputStream is = new FileInputStream("D:/Temp/parent-object.dat");
		ObjectInputStream reader = new ObjectInputStream(is);

		Parent parent = (Parent) reader.readObject();
		System.out.println("> 로드데이터:Parent=" + parent.pname);

		reader.close();
		is.close();
		System.out.println("Parent 객체 로드");
	}

}
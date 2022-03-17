package nullpointer;

public class NullPointerExceptionRun4 {

	public static void main(String[] args) {
		String data = null;
		
		System.out.println(data);
		
		String nullstring = (data == null) ? "<null>" : data.toString();
		System.out.println(nullstring);
	}

}
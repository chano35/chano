package wrapper;

public class WrapperClassRun4 {

	public static void main(String[] args) {
		
		byte b = Byte.parseByte("15");
		
		// Character objChar = Character.parseChar('a');
		char c = 'a';
		
		short s = Short.parseShort("12345");
		int i = Integer.parseInt("123456");

		// Long objLong = Long.parseLong("12345678L");
		long l = Long.parseLong("12345678");
		
		// Float objFloat = Float.parseFloat("3.14F");
		float f = Float.parseFloat("3.14");
		
		double d = Double.parseDouble("3.1415927");
		boolean bt = Boolean.parseBoolean("true");
		
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(bt);
	}

}
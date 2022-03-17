package wrapper;

public class WrapperClassRun5 {

	public static void main(String[] args) {
		
		Byte objByte = Byte.valueOf("15");
		Character objChar = Character.valueOf('a');
		Short objShort = Short.valueOf("12345");
		Integer objInt = Integer.valueOf("123456");
		Long objLong = Long.valueOf("12345678");
		Float objFloat = Float.valueOf("3.14");
		Double objDouble = Double.valueOf("3.1415927");
		Boolean objBool = Boolean.valueOf("true");
		
		System.out.println(objByte);
		System.out.println(objChar);
		System.out.println(objShort);
		System.out.println(objInt);
		System.out.println(objLong);
		System.out.println(objFloat);
		System.out.println(objDouble);
		System.out.println(objBool);
	}

}
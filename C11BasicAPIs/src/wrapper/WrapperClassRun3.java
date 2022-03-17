package wrapper;

public class WrapperClassRun3 {

	public static void main(String[] args) {
		
		Byte objByte = 15;
		Character objChar = 'a';
		Short objShort = 12345;
		Integer objInt = 123456;
		Long objLong = 12345678L;
		Float objFloat = 3.14F;
		Double objDouble = 3.1415927;
		Boolean objBool = true;

		byte b1 = objByte;
		byte b2 = objByte.byteValue();
		byte b3 = (byte)(b1 + b2 + 1);
		
		System.out.println("b1=" + b1 + ", b2=" + b2 + ", b3=" + b3);

		// 렙퍼 타입을 변환없이 연산을 수행하면
		// 연산 수행전에 기본타입으로 변환을 시켜서 연산을 수행
		Byte b4 = (byte)(objByte + 15);
		System.out.println("b4=" + b4);

		
		Byte b5 = (byte)((byte)objByte + 15);
		System.out.println("b5=" + b5);

		
		char c = objChar.charValue();
		short s = objShort.shortValue();
		int i = objInt.intValue();
		long l = objLong.longValue();
		
		float f = objFloat.floatValue();
		int ix = objFloat.intValue();
		
		double d = objDouble.doubleValue();
		boolean bl = objBool.booleanValue();
	}

}
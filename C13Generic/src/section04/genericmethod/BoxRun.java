package section04.genericmethod;

public class BoxRun {

	public static void main(String[] args) {
		// 제네릭 메소드 자료형을 명시적으로 지정 
		Box<Integer> boxInt = Utils.<Integer>boxing(1234);
		int val = boxInt.get();
		System.out.println("[boxInt] val = " + val);

		// 제네릭 메소드 자료형을 생략 가능 
		Box<Integer> boxInt2 = Utils.boxing(5678);
		int val2 = boxInt2.get();
		System.out.println("[boxInt2] val2 = " + val2);
		
		Box<Float> boxFloat = Utils.boxing(3.14f);
		Float Pi = boxFloat.get();
		float pi = boxFloat.get();
		float p2 = boxFloat.get().floatValue();
		System.out.println("[boxFloat] Pi = " + Pi);
		System.out.println("[boxFloat] pi = " + pi);
		System.out.println("[boxFloat] p2 = " + p2);
	}

}
package section03;

public class AddFunctionalInterfaceExample2 {
	public static void main(String[] args) {
		AddFunctionalInterface addFunc = (int a, int b) -> {
			int result = a + b;
			return result;
		};
		
		int result = addFunc.add((int)3.1, (int)4.4);
		System.out.println("result: " + result);
	}
}
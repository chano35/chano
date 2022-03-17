import java.util.Scanner;

public class CalcRun extends Calc{
	
	public static void main(String ar[]) {
		
		Scanner scanner = new Scanner(System.in);
		String input = null;
		int num1 = 0, num2 = 0;
		String op = null;
		System.out.print("정수 하나를 입력하세요.");
		input = scanner.nextLine();
		num1 = Integer.parseInt(input);
		System.out.print("정수 하나를 입력하세요.");
		input = scanner.nextLine();
		num2 = Integer.parseInt(input);
		System.out.print("처리할 연산 기호를 입력하세요.(+, -, *, /)");
		input = scanner.nextLine();
		op = input;
		
		if (op.equals("+"))
			System.out.printf("%d + %d = %d%n", num1, num2, Plus(num1, num2));
		if (op.equals("-"))
			System.out.printf("%d - %d = %d%n", num1, num2, Minus(num1, num2));
		if (op.equals("*"))
			System.out.printf("%d * %d = %d%n", num1, num2, Mul(num1, num2));
		if (op.equals("/"))
			System.out.printf("%d / %d = %d%n", num1, num2, Div(num1, num2));
		scanner.close();
	}
}
	


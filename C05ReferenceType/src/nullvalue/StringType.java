package nullvalue;

public class StringType {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int c = x;
		
		// 변수가 가지고 있는 값으로 비교
		System.out.printf("x(%d) == y(%d) : %b\n", x, y, (x == y));
		System.out.printf("c(%d) == x(%d) : %b\n", c, x, (c == x));
		
		// 참조로 비교
		String hello1 = "hello";
		String hello2 = "hello";
		String hello3 = hello1;
		
		System.out.printf("hello1(%s) == hello2(%s) : %b\n", hello1, hello2, (hello1 == hello2));
		System.out.printf("hello3(%s) == hello1(%s) : %b\n", hello3, hello1, (hello3 == hello1));
		
		String hw1 = hello1 + "world";
		String hw2 = hw1;
		String hw3 = new String(hw2); // 클래스를 객체화시킬 때 new를 사용
		System.out.printf("hw1(%s) == hw2(%s) : %b\n", hw1, hw2, (hw1 == hw2)); // 주소로 비교(true)
		System.out.printf("hw2(%s) == hw3(%s) : %b\n", hw2, hw3, (hw2 == hw3)); // 주소로 비교(false)

		// 문자열의 값을 비교: String.equals(value)
		// 주소가 참조하고 있는 주소에 위치해 있는 값을 비교(true)
		System.out.printf("hw2(%s).equals(hw3(%s)) : %b\n", hw2, hw3, (hw2.equals(hw3))); 

	}
}
package exercises.exercises18;

public class ShopExample {

	public static void main(String[] args) {
		ShopService svc1 = ShopService.getInstnace();
		ShopService svc2 = ShopService.getInstnace();
		
		if(svc1 == svc2) {
			System.out.println("(svc1 == svc2) 같은 서비스 객체이다.");
		}
		else {
			System.out.println("(svc1 == svc2) 다른 서비스 객체이다.");
		}

		System.out.println("x=" + svc1.getX());
		
		// ShopService svc = new ShopService();
		/*
		// StackOverflowError
		ShopService svc3 = svc1.getInstnace2();
		if(svc1 == svc3) {
			System.out.println("(svc1 == svc3) 같은 서비스 객체이다.");
		}
		else {
			System.out.println("(svc1 == svc3) 다른 서비스 객체이다.");
		}
		*/
	}

}
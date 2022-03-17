package createinstance;

public class CreateInstanceMain {

	public static void main(String[] args) {
		CreateInstance c0 = CreateInstance.createInstance(new String[] {});
		if(c0 != null) { 
			c0.print();
		}
		
		CreateInstance c1 = CreateInstance.createInstance(new String[] { "plus", "10", "20" });
		if(c1 != null) {
			c1.print();
		}

		CreateInstance m1 = CreateInstance.createInstance(new String[] { "minus", "10", "20" });
		if(m1 != null) {
			m1.print();
		}

		CreateInstance d1 = CreateInstance.createInstance(new String[] { "divide", "10", "3" });
		if(d1 != null) {
			d1.print();
		}
		else {
			System.out.println("잘못된 파라미터를 전달했습니다.(d1)");
		}

	}

}
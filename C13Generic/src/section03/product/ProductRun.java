package section03.product;

public class ProductRun {

	public static void main(String[] args) {
		Product<Car, String> procar = new Product<>();
		procar.setKind(new Car("승용차"));
		procar.setModel("GX7");
		
		Car car = procar.getKind();
		String model = procar.getModel();
		
		System.out.println("자동차 종류 : " + car.name);
		System.out.println("자동차 모델 : " + model);
		

	}

}
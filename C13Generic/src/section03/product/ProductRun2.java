package section03.product;

public class ProductRun2 {

	public static void main(String[] args) {
		Product<Tv, String> protv = new Product<>(new Tv("3DTV"), "3DX");
		
		Tv tv = protv.getKind();
		String model = protv.getModel();
		
		System.out.println("종류 : " + tv.name);
		System.out.println("모델 : " + model);
	}

}
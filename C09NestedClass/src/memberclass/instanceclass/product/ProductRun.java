package memberclass.instanceclass.product;

public class ProductRun {

	public static void main(String[] args) {
		Product product = new Product("가전");
		
		Product.Tv tv = product.new Tv(Product.Tv.PRODUCT_TV_CNT);
		tv.sale(4);
		
		Product.Smartphone smartphone = product.new Smartphone(100);
		smartphone.sale(80);
	}

}
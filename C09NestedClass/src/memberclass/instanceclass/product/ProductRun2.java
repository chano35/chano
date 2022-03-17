package memberclass.instanceclass.product;

public class ProductRun2 {

	public static void main(String[] args) {
		Product2 product = new Product2("시즌4");

		/*
		Product2.Tv tv2 = product.new Tv();
		int totTv2 = product.saleTV("STV", 7);
		
		Product2.Smartphone smartphone = product.new Smartphone(100);
		int totSm2 = product.saleSmartphone("SMP", 100);
		*/
		
		// Product2.Tv tv = product.newTv();
		Product2.Tv tv = product.tv();
		System.out.printf("[STV] total(%d)\n", tv.total());
		
		int totTv = product.makeTV("STV", 77);
		totTv = product.saleTV("STV", 7);
		System.out.printf("[STV] totalTv(%d), total(%d)\n", totTv, tv.total());
		

	}

}
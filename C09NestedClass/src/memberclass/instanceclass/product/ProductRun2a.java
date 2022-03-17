package memberclass.instanceclass.product;

public class ProductRun2a {

	public static void main(String[] args) {
		Product2 product = new Product2("시즌4");

		/*
		Product2.Tv tv2 = product.new Tv();
		int totTv2 = product.saleTV("STV", 7);
		
		Product2.Smartphone smartphone = product.new Smartphone(100);
		int totSm2 = product.saleSmartphone("SMP", 100);
		*/
		
		Product2.Tv tv = product.newTv();
		int totTv = product.makeTV("STV", 77);
		totTv = product.saleTV("STV", 7);
		System.out.printf("[STV] totalTv(%d), total(%d)\n", totTv, tv.total());
		
		Product2.Tv stv = product.tv();
		System.out.printf("[STV] stv : total(%d)\n", stv.total());
		
		Product2.Smartphone smp = product.newSmartphone();
		int totSm = product.makeSmartphone("SMP", 900);
		totSm = product.saleSmartphone("SMP", 100);
		System.out.printf("[SMP] totalSm(%d), total(%d)\n", totSm, smp.total());
		
		Product2.Smartphone smp2 = product.smartphone();
		System.out.printf("[SMP] smp2 : total(%d)\n", smp2.total());

	}

}
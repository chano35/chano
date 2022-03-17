package memberclass.instanceclass.product;

public class ProductRun2b {

	public static void main(String[] args) {
		Product2 p2 = new Product2("시즌4");

		Product2.Tv tv1 = p2.new Tv();
		System.out.printf("tv1 : total(%d), count(%d)\n", tv1.total(), p2.count);
		
		Product2.Tv tv2 = p2.new Tv(99);
		System.out.printf("tv2 : total(%d), count(%d)\n", tv2.total(), p2.count);
		
		System.out.printf("tv1(total:%d), tv2(total:%d)\n",
				tv1.total(), tv2.total());

		System.out.printf("tv1 == tv2 ? (%b)\n", (tv1 == tv2));
	}

}
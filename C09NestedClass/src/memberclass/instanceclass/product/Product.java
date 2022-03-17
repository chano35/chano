package memberclass.instanceclass.product;

public class Product {
	String pid = "P1";
	int count;
	
	Product() {
		System.out.println("[Product] pid=" + pid);
	}
	
	Product(String pid) {
		this.pid = pid;
	}
	
	void makeProduct(String name, int count) {
		this.count += count;
		System.out.printf("[makeProduct] name(%s), count(%d/%d)\n", name, count, this.count);
	}
	
	int saleProduct(String name, int count) {
		this.count -= count;
		System.out.printf("[saleProduct] name(%s), count(%d/%d)\n", name, count, this.count);
		return this.count;
	}
	
	class Tv {
		// 정적 필드는 선언할 수 없다.
		// static int PRODUCT_TV_CNT = 10;  
		final static int PRODUCT_TV_CNT = 10;  
		
		Tv() {
			System.out.printf("pid(%s) : Tv\n", pid);
			makeProduct("Tv", PRODUCT_TV_CNT);
		}
		
		Tv(int count) {
			System.out.printf("pid(%s) : Tv\n", pid);
			makeProduct("Tv", count);
		}
		
		int sale(int count) {
			return saleProduct("Tv", count);
		}
		
		/*
		 * 정적 메소드 정의 할 수 없다. 
		 */
		/*
		static int getProductTvCnt() {
			return PRODUCT_TV_CNT;
		}
		
		final static int getProductTvCnt() {
			return PRODUCT_TV_CNT;
		}
		*/
	}
	
	class Smartphone {
		final static int PRODUCT_TV_SMARTPHONE = 50;  
		
		Smartphone() {
			System.out.printf("pid(%s) : Smartphone\n", pid);
			makeProduct("Smartphone", PRODUCT_TV_SMARTPHONE);
		}
		
		Smartphone(int count) {
			System.out.printf("pid(%s) : Smartphone\n", pid);
			makeProduct("Smartphone", count);
		}
		
		int sale(int count) {
			return saleProduct("Smartphone", count);
		}
	}
	

}
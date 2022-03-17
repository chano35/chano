package memberclass.instanceclass.product;

public class Product2 {
	private String pid = "P2";
	int count;	// 전체 제품의 갯수
	
	private Tv tv;
	private Smartphone smartphone;
	
	Product2() {
		System.out.println("[Product] pid=" + pid);
	}
	
	Product2(String pid) {
		this.pid = pid;
	}
	
	Tv newTv() {
		this.tv = new Tv();
		return this.tv;
	}
	
	Tv tv() {
		if(this.tv != null) {
			return this.tv;
		}
		
		return newTv();
	}
	
	Smartphone newSmartphone() {
		this.smartphone = new Smartphone();
		return this.smartphone;
	}
	
	Smartphone smartphone() {
		if(this.smartphone != null) {
			return this.smartphone;
		}
		
		return newSmartphone();
	}
	
	int makeTV(String name, int count) {
		this.count += count;
		System.out.printf("[makeTV] name(%s), count(%d/%d)\n", name, count, this.count);
		return tv.make(count);
	}
	
	int makeSmartphone(String name, int count) {
		this.count += count;
		System.out.printf("[makeSmartphone] name(%s), count(%d/%d)\n", name, count, this.count);
		return smartphone.make(count);
	}
	
	int saleTV(String name, int count) {
		this.count -= count;
		System.out.printf("[saleTV] name(%s), count(%d/%d)\n", name, count, this.count);
		return tv.sale(count);
	}
	
	int saleSmartphone(String name, int count) {
		this.count -= count;
		System.out.printf("[saleSmartphone] name(%s), count(%d/%d)\n", name, count, this.count);
		return smartphone.sale(count);
	}
	
	class Tv {
		final static int PRODUCT_TV_CNT = 10;
		int count = -1;
		int total;
		
		Tv() {
			System.out.printf("Tv: pid(%s) : count(%d, %d)\n", pid, this.count, Product2.this.count);
		}
		
		Tv(int count) {
			this.total = count;
			System.out.printf("pid(%s) : Tv\n", pid);
		}
		
		int make(int count) {
			this.total += count;
			return this.total;
		}
		
		int sale(int count) {
			this.total -= count;
			return this.total;
		}
		
		int total() {
			return this.total;
		}
	}
	
	class Smartphone {
		final static int PRODUCT_SMARTPHONE_CNT = 100;
		int total;
		
		Smartphone() {
			System.out.printf("pid(%s) : Smartphone\n", pid);
		}
		
		Smartphone(int count) {
			this.total = count;
			System.out.printf("pid(%s) : Smartphone\n", pid);
		}
		
		int make(int count) {
			this.total += count;
			return this.total;
		}
		
		int sale(int count) {
			this.total -= count;
			return this.total;
		}
		
		int total() {
			return this.total;
		}
	}
}
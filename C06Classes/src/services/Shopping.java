/*
 * 쇼핑몰 구축:
 * - 쇼핑목록: 
 *   > 속성: 구매자, 상품명, 단가, 수량, 금액
 *   > 생성자: 
 *     -> 기본 생성자
 *     -> 구매자를 파라미터로 받는 생성자
 *     -> 전체 속성을 파라미터로 받는 생성자
 *   > 생성자별로 생성하는 객체를 만듦
 *   -----------------------------------------------
 * - 생성자가 호출되는 방식
 *   > 생성자의 이름이 같아야 한다.(클래스 이름과 동일)
 *   > 파라미터의 갯수가 같아야 한다.
 *   > 각 파라미터의 자료형의 타입이 같아야 한다.
 * - 생성자 오버로딩(Overloading)
 *   > 매개변수(파라미터)를 달리하는 생성자를 여러 개 선언하는 것      
 *     Shopping() { // 기본생성자
 *     Shopping(String cust) { // 구매자를 파라미터로 하는 생성자
 *     Shopping(String customer, String goods, int price, int quantity, int amount) { // 전체 속성을 파라미터로 하는 생성자
 * - 메소드 오버로딩(Method Overloading)     
 *   > 매개변수(파라미터)를 달리하는 메소드를 여러 개 선언하는 것   
 *  */
package services;

public class Shopping {
	final static int AMOUNT_LIMIT = 1000; // 구매금액 한계 
	
	String customer; 	// 구매자
	String goods;		// 상품명
	int price;			// 단가
	int quantity;		// 수량
	int amount;			// 금액

	public static void main(String[] args) {
		Shopping shop = new Shopping("김여사"); // 기본생성자
		shop.printInfo();

		boolean shoplimit = shop.amountLimit();
		boolean gshoplimit = globalAmountLimit(shop);
		
		System.out.println("김여사의 구매금액 한계? " + shoplimit);
		System.out.println("김여사의 구매금액 한계? " + gshoplimit);
		
		System.out.println("-----------------------------------");
		Shopping shop2 = new Shopping("홍여사", "명품백", 300, 4, 1200);
		shop2.printInfo("홍여사의 장바구니");

		boolean shoppinglimit = shop2.amountLimit();
		boolean gshoppinglimit = globalAmountLimit(shop2);
		
		System.out.println("홍여사의 구매금액 한계? " + shoppinglimit);
		System.out.println("홍여사의 구매금액 한계? " + gshoppinglimit);
	}
	
	boolean amountLimit() { // 리턴타입이 boolean
		boolean limit = (this.amount > AMOUNT_LIMIT);
		return limit;
	}
	
	static boolean globalAmountLimit(Shopping shop) {
		boolean limit = (shop.amount > AMOUNT_LIMIT);
		return limit;
	}
	
	void printInfo() {
		System.out.println("[쇼핑정보] ");
		
		System.out.printf("구매자 : %s\n", this.customer);
		System.out.printf("상품명 : %s\n", this.goods);
		System.out.printf("단  가 : %d\n", this.price);
		System.out.printf("수  량 : %d\n", this.quantity);
		System.out.printf("금  액 : %d\n", this.amount);
	}
	
	void printInfo(String title) { // 메소드(멤버함수)
		System.out.println("[쇼핑정보] " + title);
		
		System.out.printf("구매자 : %s\n", this.customer);
		System.out.printf("상품명 : %s\n", this.goods);
		System.out.printf("단  가 : %d\n", this.price);
		System.out.printf("수  량 : %d\n", this.quantity);
		System.out.printf("금  액 : %d\n", this.amount);
	}

	
	
	Shopping() { // 기본생성자
	}
	
	Shopping(String cust) { // 구매자를 파라미터로 하는 생성자
		customer = cust;
		System.out.printf("Shopping(%s): this.customer=(%s)\n", cust, this.customer);
	}

	/*
	 * 쇼핑 정보를 담는 클래스로서 ...
	 *   @param customer
	 *          구매자 정보
	 *          
	 *   @param goods
	 *          상품명 정보
	 *          
	 *   @param price
	 *          구매 단가 정보
	 *          
	 *   @param quantity
	 *          구매 수량 정보
	 *          
	 *   @param amount
	 *          구매 단가 * 구매 수량 = 금액
	 */
	Shopping(String customer, String goods, int price, int quantity, int amount) { // 전체 속성을 파라미터로 하는 생성자
		this.customer = customer;
		this.goods = goods;
		this.price = price;
		this.quantity = quantity;
		this.amount = amount;
	}
	

}

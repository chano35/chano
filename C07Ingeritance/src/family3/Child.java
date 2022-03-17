/*
 * 1. 부모가 가지고 있는 필드를 자식도 동일한 이름으로 정의할 수 있다.
 * 2. 부모의 메소드를 통해서 필드에 접근하게 되면 부모에 정의된 필드값을 참조
 * 3. 메소드 재정의(method overriding)
 *    - 부모의 메소드 형식과 동일하게 이름과 파라미터를 정의(재정의)
 *    - 자신의 필드값을 참조하게 된다.
 */
package family3;

public class Child extends Parent {
	// 부모 : money(100)
	// 자식 : money(0)
	int money = 0; 		// 부모의 필드와 자식의 필드가 동일한 이름으로 쓰는 것은 추천하자 않음
	int estate = 3000;	// 부동산
	
	Child() { // 부모의 money(100)을 물려 받음
		System.out.println("Child()");
	}
	
	Child(int money) {
		this.money = money;
		System.out.printf("Child(%d): this.money=%d\n", money, this.money);
	}
	
	/*
	 * 메소드 재정의(method overriding)
	 */
	void print(String title) {
		System.out.printf("Child(%s) : money(%d), estate(%d)\n", title, this.money, this.estate);
	}
	
	/*
	 * super.부모속성
	 */
	void printTotal() {
		int total = this.money + this.estate + super.money + super.asset;
		
		System.out.printf(">>> 나의 총 자신 <<<\n");
		System.out.printf("\t 자신의 현금(%d)\n", this.money);	 
		System.out.printf("\t 자신의 부동산(%d)\n", this.estate);
		System.out.printf("\t 상속받은 현금(%d)\n", super.money); 
		System.out.printf("\t 상속받은 금융자산(%d)\n", super.asset);
		System.out.printf("\t-----------------------------------------------\n");
		System.out.printf("\t 총자산(%d)\n", total);
	}

}
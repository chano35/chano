/*
 * [문제] 상속
 * 1. 클래스 사람(People)
 *    - 속성: 키, 몸무게, 성구분, 나이
 *    - 메소드: 말한다, 걷는다, 달린다, 일한다.
 * 2. 남자(Man) 클래스는 People를 상속
 *    - 메소드: 사냥한다.
 * 3. 여자(Woman) 클래스는 People를 상속
 *    - 속성: 임신개월수
 *    - 메소드: 출산한다.(10개월이면 출산 가능)    
 * 4. 형제(Brother)는 남자를 상속
 * 5. 자매(Sister)는 여자를 상속    
 */
package people;

public class People {
	String name;	// 이름
	int height;		// 키
	int weight;		// 몸무게
	int sex;		// 성구분
	int age;		// 나이

	People() {
		this.name = "아무개";
	}
	
	public People(String name) {
		this.name = name;
	}

	public People(String name, int height, int weight, int sex, int age) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.sex = sex;
		this.age = age;
	}

	void speak() {
		System.out.printf("People: speak(%s)\n", this.name);
	}
	
	void walk() {
		System.out.printf("People: walk(%s)\n", this.name);
	}

	void run() {
		System.out.printf("People: run(%s)\n", this.name);
	}
	
	void work() {
		System.out.printf("People: work(%s)\n", this.name);
	}
}
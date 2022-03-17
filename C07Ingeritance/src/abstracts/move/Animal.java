package abstracts.move;

/*
 * [일반 클래스]
 * 일반 클래스는 메소드에 구현을 가지고 있다.
 */
/*
public class Animal {
	public void move() {
		System.out.println("동물을 움직인다.");
	}
}
*/

/*
 * [추상클래스]
 * 클래스 앞에 abstract를 명시
 */
/*
public abstract class Animal {
	public void move() {
		System.out.println("동물을 움직인다.");
	}
}
*/

/*
 * 추상메소드
 * - 추상클래스에서 구현이 없는 메소드를 추상 메소드
 * - 추상 메소드가 하나라도 존재하면 클래스는 추상 메소드가 되어야 한다.
 * - The type Animal must be an abstract class to define abstract methods
 * 
 */
public abstract class Animal {
	public abstract void move();
}
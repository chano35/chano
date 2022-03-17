/*
 * [인스턴스 멤버 클래스]
 */
package memberclass.instanceclass;

public class BasicClass {
	
	BasicClass() {
		System.out.println("BasicClass: NestedClass의 외부 클래스");
	}
	
	class NestedClass {
		NestedClass() {
			System.out.println("NestedClass: BasicClass의 내부 클래스");
		}
		
		void printNested() {
			System.out.println("NestedClass: printNested()");
		}
		
	}
	
	void printBasic() {
		System.out.println("BasicClass: printBasic()");
	}

}
/*
 * 다형성(Polymorphism)
 * - 상속관계에 있을 때 자식 클래스로 객체를 생성하여 부모의 클래스 타입으로 받을 수 있다.
 * - 자식 클래스에서 재정의 된 메소드는 부모 클래스 타입의 변수로 실행해도 
 *   자식에 의해 재정의 된 메소드가 실행된다.
 *   
 * 자동타입변환(Promotion)
 * - 부모클래스 변수 = 자식클래스     
 *   
 */
package casting;

public class BusRun2 {

	public static void main(String[] args) {
		// Promotion: 자식타입에서 부모타입으로 자동 타입변환
		Vehicle vehicle = new Bus();
		
		for(int station=0; station < 10; station++) {
			vehicle.run();
		}

		/*
		 * Bus의 부모인 Vehicle에는 아래의 메소드가 정의 되어 있지 않다.
		 */
		/*
		vehicle.run(2);
		vehicle.getStation();
		vehicle.print();
		*/
		
		Bus bus = (Bus)vehicle; // 강제로 타입변환(casting)
		bus.run(2);
		System.out.println("Bus: station=" + bus.getStation());
		
		Vehicle vbus = bus; // promotion(자동 타입변환)
		vbus.run();
	}

}
package ch08_인터페이스.sec10.exam2;

public class CastingExample {

	public static void main(String[] args) {
		
		//인터페이스 변수 선언과 구현 객체 대입
		Vehicle vehicle = new Bus();
		
		vehicle.run();
//		vehicle.checkFare(); //사용 불가
		
		//강제 타입 변환 후 호출
		Bus bus = (Bus)vehicle;
		bus.run();
		bus.checkFare();
	}

}

package ch08_인터페이스.sec08;

public class MultiInterfaceImpleExample {

	public static void main(String[] args) {

		//RemoteControl 인터페이스 변수 선언 및 구현 객체 대입
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();

		System.out.println();
		
		//Searchable 인터페이스 변수 선언 및 구현 객체 대입
		Searchable searchable = new SmartTelevision();
		searchable.search("www.youbute.com");
		
		
		System.out.println();
		
		SmartTelevision st = new SmartTelevision();
		
		st.turnOn();
		st.search("www.youtube.com");
		st.turnOff();
		
	}

}

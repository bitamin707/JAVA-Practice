package ch07_상속.sec08.exam2;

public class DriverExample {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		driver.driver(bus);
		
		Texi texi = new Texi();
		driver.driver(texi);
		
	}
	
}

package ch07.sec09;

public class InstanceofExample {

	//정적 메소드 선언
	public static void personInfo(Person person) {
		System.out.println("name : " + person.name);
		person.walk();
		
		/* 객체 타입 확인
		if(person instanceof Student) {
			//Student 객체일 경우 강제 타입 변환
			Student student = (Student)person;

			//Student 객체만 가지고 있는 필드 및 메소드 사용
			System.out.println("StudentNo : " + student.studentNo);
			student.study();;
		}
		*/
		// 객체 타입 확인 (JAVA 12부터 사용가능)
		if(person instanceof Student student) {
			//Student 객체만 가지고 있는 필드 및 메소드 사용
			System.out.println("StudentNo : " + student.studentNo);
			student.study();;
		}
	}

	public static void main(String[] args) {
		//Person 객체를 매개값으로 제공하고 personInFo() 메소드 호출
		Person p1 = new Person("홍길동");
		personInfo(p1);
		
		System.out.println();
		
		//Student 객체를 매개값으로 제공하고 personInfo() 메소드 호출
		Person p2 = new Student("김길동", 10);
		personInfo(p2);
	}

}

package ch07.sec07.exam3;

public class ChildExample {
	
	public static void main(String[] args) {
		//객체 생성 및 자동 타입 변환
		Parent parent = new Child();
		
		//Parent 타입으로 필드와 메소드 사용
		parent.field1 = "parent-data1";
		parent.field3 = "parent-data3";
		parent.method1();
		parent.method2();
		System.out.println("field1 : " + parent.field1);
		System.out.println("field3 : " + parent.field3);
		
		//불가능
//		parent.field2 = "data2";
//		parent.mehtod3();
		
		//강제 타입 변환
		Child child = (Child)parent;
		
		//Child 타입으로 필드와 메소드 사용
		child.field1 = "child-data1";
		child.field2 = "child-data2";
		child.field3 = "child-data3";
		System.out.println("field1 : " + child.field1);
		System.out.println("field2 : " + child.field2);
		System.out.println("field3 : " + child.field3);
		child.method1();
		child.method2();
		child.method3();
		
	}
}

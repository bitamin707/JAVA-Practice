package ch11_예외처리.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) throws Exception {

		
		//리소스 열기
		MyResource res1 = new MyResource("res1");
		
		/*
		//리소스 읽기
		System.out.println(Integer.parseInt(res1.read1()));
		System.out.println(Integer.parseInt(res1.read2()));
		
		//리소스 닫기
		res1.close();
		*/
		try {
			//리소스 읽기
			System.out.println(Integer.parseInt(res1.read1()));
			System.out.println(Integer.parseInt(res1.read2()));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			//리소스 닫기
			res1.close();
		}
		
		System.out.println();

		try(MyResource res2 = new MyResource("res2")) {
			//리소스 읽기
			System.out.println(Integer.parseInt(res2.read1()));
			System.out.println(Integer.parseInt(res2.read2()));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println();

		MyResource res3 = new MyResource("res3");
		try(res3) {
			//리소스 읽기
			System.out.println(Integer.parseInt(res3.read1()));
			System.out.println(Integer.parseInt(res3.read2()));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		System.out.println();

		MyResource res4 = new MyResource("res4");
		MyResource res5 = new MyResource("res5");
		try(res4; res5) {
			//리소스 읽기
			System.out.println(Integer.parseInt(res4.read1()));
			System.out.println(Integer.parseInt(res4.read2()));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

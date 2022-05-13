import org.omg.CORBA.PUBLIC_MEMBER;

public class Sample02_variable5_3 {	// class 시작
	
	String name;
	char gender;
	int age;
	boolean married;
	double height;
	// 멤버변수, 인스턴스 변수, 전역변수 : 클래스 블럭에 선언
	// 1. new 키를 이용하여 객체를 생성할 때 변수가 생성됨/ 더 이상 참조하지 않을 경우, 프로그램이 끝났을 경우 삭제됨
	// 2. 전역변수 : 클래스 전체에서 사용 가능, 객체 생성시 참조 변수를 이용해야 함
	// 3. 선언만 해도 객체 생성시 자동으로 초기화됨
		// 정수 : 0, 실수 : 0.0, char : 공백, String : null, boolean : false 로 자동 초기화
		// 자동 초기화되므로 객체 생성 후 초기화 없이 바로 사용 가능

	public static void main(String[] args) {	// main 시작
		
		int n = 0;
		// 로컬변수 (local variable) : 메서드 안에서 선언
		// 메인에 속한 로컬변수
		// 1. 함수가 실행되어 코드가 실행될 때 변수 생성, 함수 종료시 삭제
		// 2. 사용 범위는 속한 블럭 안에서 한정
		// 3. 선언, 초기화 명시적으로 한 후에 사용해야 함(아닐시 에러)
		
		System.out.println(n);
		
//		// 객체 생성 후 객체의 멤버변수 접근, 사용
//		Sample02_variable5_3 t = new Sample02_variable5_3(); // 클래스 객체 생성, 자동 초기화
//		System.out.println(t);
//		System.out.println(t.name);	// 참조 변수 사용하여 객체의 변수에 접근
//		System.out.println(t.c);
//		System.out.println(t.m);
//		System.out.println(t.g);
//		System.out.println(t.d);
		
		Sample02_variable5_3 test = new Sample02_variable5_3();
		System.out.println("이름 :"+test.name+", 나이 :"+test.age+", "
				+ "성별 :"+test.gender+", 결혼 여부 :"+test.married+", 키 :"+test.height);
		System.out.println("==================================================");
		
		test.name = "홍길동";
		System.out.println("이름 :"+test.name+", 나이 :"+test.age+", "
				+ "성별 :"+test.gender+", 결혼 여부 :"+test.married+", 키 :"+test.height);
				// 변수에 값 저장 가능
		
	}	// main 끝
	
	

}	// class 끝

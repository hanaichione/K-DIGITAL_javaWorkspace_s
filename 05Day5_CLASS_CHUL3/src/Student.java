
public class Student {

	String name;
	int age;
	String address;
	
//	public Student() {			
//		System.out.println("기본(default) 생성자 호출됨 ==========================");
//	}	// 기본 생성자를 명시적으로 기재하여 기본 생성자를 사용해 객체를 생성할 수 있도록 함
	
	public Student() {};	// 기본 생성자 기본 코드만 명시적으로 작성
	
	// 오버로딩 : 생성자의 이름은 동일하지만, 매개변수 다른 것으로 구분지어 사용
	public Student(String n) {	// 매개변수를 받는 생성자를 명시적 작성, jdk가 기본 생성자 안 만들어줌
		System.out.println("매개변수 1개짜리 생성자 호출됨");
		name = n;	// 멤버변수 name을 매개변수 값으로 초기화
	}
	
	// ****** 명시적 생성자를 만들면 기본 생성자를 묵시적으로 만들어주지 않음 ******
	// --> 기본 생성자를 명시적으로 만들거나, 다른 생성자에 맞춰 코드를 사용
	
	
}

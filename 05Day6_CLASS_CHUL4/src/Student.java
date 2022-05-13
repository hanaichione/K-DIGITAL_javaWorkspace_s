
public class Student {

//	String name;//이름  초기값 지정
//	int age; //나이 
//	String address;// 주소
//
//	// 기본 생성자
//	public Student() {};
//	
//	public Student(String name, int age, String address) {
//		System.out.println("String n, int age, String add 호출됨===============");
//		this.name = name;	// 멤버변수 = 로컬변수;
//		this.age = age;
//		this.address = address;
//		// this 멤버변수와 로컬변수의 구분, this는 현재 만들어지는 객체를 의미
//	};
	
	String name;
	int age;
	String address;
	String phone="010";

	public Student(String name, int age, String address, String phone) {
		super();
		System.out.println("매개변수 4개==================");
		this.name = name;
		if(age>0) {this.age = age;};
		this.address = address;
		this.phone = phone;
	}

	public Student(String name, int age, String address) {
		super();
		System.out.println("매개변수 3개==================");
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public Student() {
		super(); // 묵시적으로 super() 자동 삽입됨
		// TODO Auto-generated constructor stub
	}
	
	
	
}

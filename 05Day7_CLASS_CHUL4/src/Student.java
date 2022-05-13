import org.omg.CORBA.PUBLIC_MEMBER;

public class Student {
//	// 정보은닉화(인캡슐레이션)
//			/* 1. 멤버변수에 접근제한 걸기
//			 * 2. 각 멤버변수에 접근하는 get, set함수 만들기
//			 * 3. 다른 클래스에서 get, set을 통해 변수에 접근, 사용
//			 * */
//	// 함수의 문법 - 클래스 블럭에 위치
//	// 접근제한자 리턴타입(반환값)/ 반환값이 없는 경우 void 함수이름 (식별자) (매개변수) {}
//	
//	private String name;//이름  초기값 지정
//	private int age; //나이 
//	private String address;// 주소
//	
//	// name값을 설정
//	public void setName(String n) {	// 다른 클래스에서 접근 가능, 리턴값 없음, 문자열 1개 받아서 사용
//		System.out.println("setName 함수 호출됨===================");
//		name = n;
//		// return 100; // int형 리턴값이 있을 때
//	};
//	
//	// name값을 필요한 곳에 반환(리턴)
//	public String getName() {			// 다른 클래스에서 접근 가능, 문자열 1개 리턴, 받는 값(매개변수) 없음
//		System.out.println("getName 함수 호출됨===================");
//		return name;
//		// System.out.println("getName 함수 호출됨==================="); // 오류 : return 이후로 실행 불가
//	}
//	
//	public void setAge(int age) {
//		if (age>0) {
//			this.age = age;
//		} else {
//			System.out.println("나이가 0보다 작습니다. 설정할 수 없습니다.");
//		}
//		
//	}
//	
//	public int getAge() {
//		return this.age;
//	}
//	
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	
//	public String getAddress() {
//		return this.address;
//	}
//	
//	public Student(String name, int age, String address) {
//		super();
//		this.name = name;
//		if(age>0) {this.age = age;};
//		this.address = address;
//	}
//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
//	// 정보은닉화(인캡슐레이션) : 잘못된 데이터 저장 방지
//	// 1. 은닉화 스탭1 : 멤버변수에 접근제한 걸기
//	private String name;
//	private int age;
//	
//	// 객체생성시 데이터 설정
//	// 생성자 오버로딩 : 리턴 타입 없음(객체 생성만 하면 끝)
//	public Student (String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//	
//	public Student () {}
//	
//	// set 함수
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//	// get 함수
//	public String getName() {
//		return this.name;
//	}
//	
//	public int getAge() {
//		return this.age;
//	}
//	
//	// 데이터 출력용 함수
//	public void PrintData() {
//		System.out.println(this.name+"\t"+this.age);
//	}
	
	private String name;
	private int age;
	private String address;
	
	public Student() {};
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	public void print() {
		System.out.println(this.name+"\t"+this.age+"\t"+this.address);
	}
}

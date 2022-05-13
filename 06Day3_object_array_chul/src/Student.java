
public class Student {

	private String name;
	private int age;
	private String address;
	
	
	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("3개 짜리 생성자 호출==============");
	}
	
	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//		this.address = "미상";
		
//		this() : 같은 클래스의 생성자를 호출, 사용
		this(name, age, "미상");		// 매개변수 세개짜리 생성자를 호출하고 있음
		System.out.println("2개 짜리 생성자 호출==============");
	}
	
	// 나이가 빠진 생성자
	public Student(String name, String address) {
		this(name, 20, address);
	}

	// 기본 생성자
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}

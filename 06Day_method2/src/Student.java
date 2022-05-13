// 하나의 클래스에 들어가는 것
/// 멤버변수
/// 생성자
/// get,set함수
/// toString함수
public class Student {

	private String name;
	private int age;
	private String address;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName(매개변수 name)=========");
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 200) {
			System.out.println("나이 데이터가 너무 큽니다.=======");
		} else {
			this.age = age;
			System.out.println("나이 데이터 변경 완료=======");
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
		System.out.println("주소 데이터 변경 완료========");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}

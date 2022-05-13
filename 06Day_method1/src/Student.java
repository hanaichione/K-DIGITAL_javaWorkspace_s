// 하나의 클래스에 들어가는 것
/// 멤버변수
/// 생성자
/// get,set함수
/// toString함수
public class Student {

	private String name;//접근 지정자 default, private 로지정 -같은 클래스에서만 사용가능 : 
	private int age;
	private String address;// 다른 클래스에서  참조변수.변수명 사용 안됨.
	
	public Student(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
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

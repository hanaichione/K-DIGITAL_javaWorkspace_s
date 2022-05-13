
public class Student {

	// 멤버변수
	String name;
	int age;
	String addr;

	// 생성자
	public Student(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	// get,set함수
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getData() {
		return this.name + "\t" + this.age + "\t" + addr;
	}

	// 클래스 내에서 함수안에서 다른 함수의 호출의 경우
	public String getData2() {
		return this.name + "\t" + this.age + "\t" + addr;
		// return this.getName()+ "\t"+ this.getAge()+"\t"+getAddr();
	}

}

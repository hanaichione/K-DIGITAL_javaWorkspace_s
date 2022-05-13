
public class Cat extends Pet {
	
	private String gender;

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("야옹!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("생선 먹기!");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("새근새근!");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cat [gender=" + gender + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Cat(String gender) {
		super();
		this.gender = gender;
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String name, int age, String gender) {
		super(name, age);
		this.gender = gender;
		// TODO Auto-generated constructor stub
	}
	
	
}


public class TestStudent {

	private static void changeAge(Student stu) {
		// TODO Auto-generated method stub
		System.out.println("changeAge에서 stu==="+stu);
		stu.setAge(100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student("홍길동", 20, "서울");
		System.out.println("변경 전 나이 : " + stu.getAge());
		
		changeAge(stu);		// call by reference
		
		System.out.println("변경 후 나이 : " + stu.getAge());
	}

}

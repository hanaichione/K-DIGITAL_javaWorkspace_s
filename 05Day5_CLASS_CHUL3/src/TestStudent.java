
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 객체 생성
		Student stu = new Student();
		
		// 2. 객체 사용
		System.out.println(stu.name+"\t"+stu.age+"\t"+stu.address);
		
		// 1-2. 객체 생성2
		Student stu2 = new Student("홍길동");
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
	}

}

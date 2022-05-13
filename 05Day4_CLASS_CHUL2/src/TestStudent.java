
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1 = new Student();
		System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);
		Student stu2 = new Student();
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
		
		System.out.println(stu1 == stu2);
		
		
		stu2.name = "이순신";
		stu2.age = 30;
		stu2.address = "경기";
		
		System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
	}

}


public class TestStudent {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Student stu1 = new Student();
//		stu1.name = "홍길동";
//		stu1.address = "서울";
//		stu1.age = 20;
//		
//		Student stu2 = new Student("이순신", 10, "경기");
//		
//		System.out.println(stu1.name+"\t"+stu1.age+"\t"+stu1.address);
//		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address);
		
		Student stu = new Student("이순신", 40, "경기", "011");
		Student stu2 = new Student("이순신", 40, "주소", "016");
		Student stu3 = new Student("AA", 10, "BB");
		
		System.out.println(stu.name+"\t"+stu.age+"\t"+stu.address+"\t"+stu.phone);
		System.out.println(stu2.name+"\t"+stu2.age+"\t"+stu2.address+"\t"+stu2.phone);
		System.out.println(stu3.name+"\t"+stu3.age+"\t"+stu3.address+"\t"+stu3.phone);
	}
}

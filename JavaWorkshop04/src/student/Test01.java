package student;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu01 = new Student("Kim", 100, 90, 95, 89);
		Student stu02 = new Student("Lee", 60, 70, 99, 98);
		Student stu03 = new Student("Park", 68, 86, 60, 40);
		
		Student [] stu = new Student[3];
		
		stu[0] = stu01;
		stu[1] = stu02;
		stu[2] = stu03;
		
		System.out.println(stu01.getName()+"평균: "+stu01.getAvg()+" 학점: "+stu01.getGrade());
		System.out.println(stu02.getName()+"평균: "+stu02.getAvg()+" 학점: "+stu02.getGrade());
		System.out.println(stu03.getName()+"평균: "+stu03.getAvg()+" 학점: "+stu03.getGrade());
	}
}

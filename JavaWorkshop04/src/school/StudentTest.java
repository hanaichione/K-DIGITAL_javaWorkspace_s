package school;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student("홍길동", 15, 171, 81);
		Student stu2 = new Student("한사람", 13, 183, 72);
		Student stu3 = new Student("임걱정", 16, 175, 65);
		
		Student [] stuarr = {stu, stu2, stu3};
		
		double totalAge=0.0;
		double totalHeight=0.0;
		double totalWeight=0.0;
		
		System.out.println("이름 \t 나이 \t 신장 \t 몸무게");
		
		for (int i = 0; i < stuarr.length; i++) {
			totalAge += stuarr[i].getAge();
			totalHeight += stuarr[i].getHeight();
			totalWeight += stuarr[i].getWeight();
			System.out.println(stuarr[i].getName() + " \t " + stuarr[i].getAge() + " \t "
					+ stuarr[i].getHeight() + " \t " + stuarr[i].getWeight());

			System.out.println();
			System.out.printf("나이의 평균 : %.2f \n", totalAge / 3);
			System.out.printf("신장의 평균 : %.2f \n", totalHeight / 3);
			System.out.printf("몸무게의 평균 : %.2f \n", totalWeight / 3);

		}
	}

}

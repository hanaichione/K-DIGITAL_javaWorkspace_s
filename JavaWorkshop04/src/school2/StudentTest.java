package school2;

import school2.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu = new Student("홍길동", 15, 171, 81);
		Student stu2 = new Student("한사람", 13, 183, 72);
		Student stu3 = new Student("임걱정", 16, 175, 65);

		Student[] studentArray = { stu, stu2, stu3 };

		double totalAge = 0.0;
		double totalHeight = 0.0;
		double totalWeight = 0.0;
		int maxAgeIndex = 0;
		int minAgeIndex = 0;
		int maxHeightIndex = 0;
		int minHeightIndex = 0;
		int maxWeightIndex = 0;
		int minWeightIndex = 0;

		System.out.println("이름 \t 나이 \t 신장 \t 몸무게");

		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i].getInfo());
			totalAge += studentArray[i].getAge();
			totalHeight += studentArray[i].getHeight();
			totalWeight += studentArray[i].getWeight();
			if (studentArray[maxAgeIndex].getAge() < studentArray[i].getAge()) {
				maxAgeIndex = i;
			}
			if (studentArray[minAgeIndex].getAge() > studentArray[i].getAge()) {
				minAgeIndex = i;
			}
			if (studentArray[maxHeightIndex].getHeight() < studentArray[i].getHeight()) {
				maxHeightIndex = i;
			}
			if (studentArray[minHeightIndex].getHeight() > studentArray[i].getHeight()) {
				minHeightIndex = i;
			}
			if (studentArray[maxWeightIndex].getWeight() < studentArray[i].getWeight()) {
				maxWeightIndex = i;
			}
			if (studentArray[minWeightIndex].getWeight() > studentArray[i].getWeight()) {
				minWeightIndex = i;
			}

		}
		System.out.println();
		System.out.printf("나이의 평균 : %.2f \n", totalAge / 3);
		System.out.printf("신장의 평균 : %.2f \n", totalHeight / 3);
		System.out.printf("몸무게의 평균 : %.2f \n", totalWeight / 3);

		System.out.println();
		System.out.println("나이가 가장 많은 학생 : " + studentArray[maxAgeIndex].getName());
		System.out.println("나이가 가장 적은 학생 : " + studentArray[minAgeIndex].getName());
		System.out.println("키가 가장 큰 학생 : " + studentArray[maxHeightIndex].getName());
		System.out.println("키가 가장 작은 학생 : " + studentArray[minHeightIndex].getName());
		System.out.println("몸무게가 가장 많은 학생 : " + studentArray[maxWeightIndex].getName());
		System.out.println("몸무게가 가장 적은 학생 : " + studentArray[minWeightIndex].getName());

	}
}

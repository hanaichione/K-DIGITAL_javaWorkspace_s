
public class Sample02_variable {

	public static void main(String[] args) { // main 시작
		
		// 홍길동 20 서울 성별(남) 미혼 키185.63 체중78.25

		// 함수 안에 선언된 변수 : 로컬, 지역 변수
		/// 선언된 함수 안에서만 사용 가능, 함수 호출시 생성, 종료시에 소멸됨
		/// 로컬 변수는 반드시 선언, 초기화 후 사용해야 함
		
		// 1. 변수 선언(메모리에 특정크기의 영역 생성)
		String name;		// 변수, name 변수, 문자열 변수, String 타입의 변수, 참조형 변수
		int age;			// 변수, age 변수, 정수형 변수, int 타입의 변수, 기본형 변수
		String address;		// 참조형 변수
		char gender;		// 변수, gender 변수, 문자형 변수, char 타입의 변수, 기본형 변수
		boolean isMarried;	// 기본형 변수
		float height;		// 기본형 변수
		double weight;		// 기본형 변수

		// 2. 변수 초기화
		name = "홍길동";
		age = 20;
		address = "서울";
		gender ='남';
		isMarried = false;
		height = 185.63F;
		weight = 78.25;
		
		// 3. 변수의 사용
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(gender);
		System.out.println(isMarried);
		System.out.println(height);
		System.out.println(weight);
		
		int age2;	// 변수는 저장값이 상황에 따라 바뀜
		age2=10;
		age2=20;
		System.out.println(age2+100);
		System.out.println(age2);
		
		age2= age2+100;
		System.out.println(age2);
		
	} // main 끝

}


public class Sample02_variable5_1 {

	public static void main(String[] args) {
		
		//java는 블럭 scope (자바스크립트는 함수 scope)
		
		int num = 10;	// main에 속한 로컬변수, main 전체에서 사용 가능
		
		{ // a 블럭
			num = 20;
			int num2= 10; // a 블럭 안의 로컬변수
			System.out.println(num);
		}
		
		// System.out.println(num); // 블럭 밖에서 인식 불가
		
		{ // b 블럭
			num = 30;
			System.out.println(num);
		}
		// System.out.println(num); // 블럭 밖에서 인식 불가
		num = num+10;
		System.out.println(num);	// 40이 출력됨
	}

}


public class ArrayTest3 {
	
	private static void change(int n) {
		// TODO Auto-generated method stub
		System.out.println("change 함수 n : "+ n);	// 10
		n=20;	// 20이 나오지만 함수 호출 끝나는 순간 사라짐
	}
	
	private static void change2(int[] n) {
		// TODO Auto-generated method stub
		System.out.println("change 함수2 n[2] : "+ n[2]);		// 30
		n[2] = 100;	// 배열 위치의 값을 바꾸기 때문에 원본 값이 바뀜
	}
	
	private static void change3(int i) {
		// TODO Auto-generated method stub
		System.out.println("change 함수2 i : "+i);
		i = 500;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 기본형 데이터 : call by value
		int xxx = 10;
		System.out.println("호출전 : "+xxx);	// 10
		change(xxx);	// 기본데이터 (8가지) : 매개변수에 복사저장, call by value(값만 넘겨줌)
		System.out.println("함수 호출 후 : "+xxx);	// 10
		
		System.out.println("====================================");
		
		// 참조형 데이터 : call by reference ** 시험 **
		int num [] = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		System.out.println("호출전 : "+num[2]);	// 30
		change2(num);	// 30
		System.out.println("함수 호출 후 : "+num[2]);	// 100, 참조형 데이터 : 매개변수에 원본저장, 
													// call by reference(주소가 넘어감)
	
		// 배열 안의 값을 넘기는 것 : call by value
		System.out.println(num[0]);
		change3(num[0]);
		System.out.println(num[0]);
	}
}

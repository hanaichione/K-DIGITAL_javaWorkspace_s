
public class ArrayTest {

	public static void main(String[] args) {

		// 1. 배열 선언
		// 데이터타입 변수명 [];
//		int num [];
//		
////		// 2. 배열 생성
////		// 변수명 = new 데이터타입[크기];
//		num = new int[3];	// int를 저장할 3개의 방 생성 후 num이 참조
//		System.out.println(num[2]);	// index(방번호) 0~2까지 3개의 방
//		
//		// 3. 배열 초기화
//		num[0] = 10;
//		num[1] = 20;
//		num[2] = 30;
//		
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		
//		System.out.println("배열크기(길이)"+num.length);
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(">>"+num[i]);
//		}
		
		int num [] = new int[4];
		
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		num[3] = 400;
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println(sum);
		
		System.out.println("=================================");
		
		// for each
		int sum2 = 0;
		for (int i : num) {
			sum2 += i;
			System.out.println(i);
		}
		System.out.println(sum2);
		System.out.println("==================================");
		
		int num2 [];
		num2 = new int[4];
		num2[0] = 1;
		num2[1] = 2;
		num2[2] = 3;
		
		for (int i = 0; i < num2.length; i++) {
			System.out.println(" 배열 값 : "+num2[i]);
		}
	}

}

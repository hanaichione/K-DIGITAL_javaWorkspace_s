
public class ForTest {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		
		// 1. 0부터 4까지 찍기
//		for (int i = 0; i < 5; i++) {
//			System.out.println("hello "+i);
//		}
//		System.out.println("main 마지막 부분 ================");
		
		// 2. 10부터 1까지 찍기
//		for (int i = 10; i >= 1; i--) {
//			System.out.println(i);
//		}
		
		// 3. 짝수만 찍기
//		for (int i = 0; i <= 10; i += 2) {
//			System.out.println(i);
//		}
		
		// 4. 반복 제어 변수 2개
//		int i=0;	// 반복 제어 변수가 여러개인 경우 for문 외부에서 변수 선언
//		int j=0;
//		for (i=0, j=0; i < 5 && j < 3; i++, j++) {
//			System.out.println("happy "+i+" : "+j);
//		}
//		System.out.println("for문 밖 "+i+" : "+j);
		
		// 5.이중for문
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.println(i+"\t"+j);
//			}
//			System.out.println(("====================="));
//		}
		
		// 6. 구구단
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i+"*"+j+" = "+i*j);
//			}
//			System.out.println(("====================="));
//		}
		
		// 7. 1-100 더하기
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			System.out.println("누적되는 합계 : "+sum);
//			sum += i;
//		}
//		System.out.println("총합은 : "+sum);
		
		// 8. 이중 for문, j<=i
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
//				System.out.println(i+"\t"+j);
				System.out.print("*");
			}
			System.out.println();
//			System.out.println("===================");
		}
	}
}

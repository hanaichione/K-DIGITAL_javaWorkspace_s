
public class IFTest {

	public static void main(String[] args) {

		// 단일 if문 1
		System.out.println("문장1");
		int num = 0;
		if (3 == 3) { // 조건이 true인 경우 블럭 안의 코드 실행
			num = 10;
			System.out.println("문장2");
			System.out.println("문장2-1");
		} // 조건이 false인 경우 블럭 스킵
		System.out.println(num);

		System.out.println("문장3");
		
		// 단일 if문 2
		System.out.println("++++++++++++++++++++++++++++++++");
		int num2 = 100;
		int result = num2%2;
		String mesg = "홀수";
//		if (result == 0) {
//			mesg = "짝수";
//		}
		if (result == 0) mesg = "짝수";	// 명령이 한줄인 경우 {} 생략 가능
		System.out.println(mesg);

		// 단일 if문 3
		System.out.println("+++++++++++++++++++++++++");
		char c = 'C';
		String mesg2 = "대문자";
		if ((c >= 'a') && (c <= 'z')) {
			mesg2 = "소문자";
		}
		System.out.println(mesg2);
		System.out.println("main종료");
	}

}

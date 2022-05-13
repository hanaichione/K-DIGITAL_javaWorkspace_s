import java.util.Scanner;

public class IFTest2 {

	public static void main(String[] args) {
		
		// if else 1
//		System.out.println("문장1");		// 문장1
//		int num = 0;
//		if (3==3) {
//			num = 3;
//			System.out.println("참");	// 참
//			System.out.println(num);	// 3
//		}else {
//			System.out.println("거짓");
//		}
//		System.out.println(num);		// 3 == 3 인 경우 3
//		System.out.println("문장3");		// 문장3
		
		// if else 2
//		char c = 'C';
//		if ((c >= 'a')&&(c <= 'z')) {
//			System.out.println("소문자");
//		} else {
//			System.out.println("대문자");
//		}
//		System.out.println("end");
		
//		System.out.println("+++++++++++++++++++++++++");
//		char c = 'C';
//		String mesg2;
//		if ((c >= 'a') && (c <= 'z')) {
//			mesg2 = "소문자";
//		} else {
//			mesg2 = "대문자";
//		}
//		System.out.println(mesg2);
//		System.out.println("main종료");
		
		// if else 3
		System.out.println("=================================");
//		Scanner scan = new Scanner(System.in);
//		int num2 = scan.nextInt();
//		String mesg = "";
		
		int num2 = 100;
		String mesg= "";
		if (num2 % 2 == 0) {
			mesg = "짝수";
		} else {
			mesg = "홀수";
		}
		System.out.println(mesg);
		System.out.println("=================================");
	}

}

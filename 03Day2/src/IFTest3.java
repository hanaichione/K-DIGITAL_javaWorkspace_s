import java.util.Scanner;

public class IFTest3 {

	public static void main(String[] args) {
//		System.out.println("점수를 입력하시오 : ");
//		Scanner scan = new Scanner(System.in);
//		//int num = scan.nextInt();
//		String num_str = scan.next();
//		int num = Integer.parseInt(num_str);
//		if (num >= 90) {
//			System.out.println("A학점");
//		} else if (num >= 80) {
//			System.out.println("B학점");
//		} else if (num >= 70) {
//			System.out.println("C학점");
//		} else {
//			System.out.println("F학점");
//		}
//		System.out.println("문장3");
		
		System.out.println("점수를 입력하시오 : ");
		Scanner scan = new Scanner(System.in);
		//int num = scan.nextInt();
		String num_str = scan.next();
		int num = Integer.parseInt(num_str);
		if (num < 70) {
			System.out.println("F");
		} else if (num < 80) {
			System.out.println("C");
		} else if (num < 90) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
		System.out.println("문장3");
	}
		
}

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 n까지의 총합 구하기");

		int n = 0;
		int sum = 0;

		// do while문으로 음수일 때 반복하기
//		do {
//			System.out.print("n 값 : ");
//			n = scan.nextInt();
//			if(n<=0) {
//				System.out.println("양수값 입력해 주세요.");
//			}
//		}while(n <= 0);

		System.out.print("n 값 : ");
		n = scan.nextInt();

		while (n <= 0) {
			System.out.println("양수값 입력해 주세요.");
			System.out.print("n 값 : ");
			n = scan.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 " + n + "까지의 총합 : " + sum);
	}

}

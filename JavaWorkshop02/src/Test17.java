import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("오른쪽 위가 직각인 삼각형");
		int n = 0;
		do {
			System.out.print("몇 단 삼각형입니까? ");
			n = scan.nextInt();
		} while (n <= 0);

//		for (int i = n; i >= 1; i--) {
//			for (int j = 0; j == n-i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = i; j >= 1; j--) {
//				System.out.printf("*");
//			}
//			System.out.println();

		for (int i = 1; i <= n; i++) { // i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= i - 1; j++) // i-1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= n - i + 1; j++) // n-i+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); // 개행(줄변환)
		}
//		
//		for (int i = 0; i <= n; i++) { // i행 (i = 1, 2, … ,n)
//			for (int j = 1; j <= i; j++) // i-1개의 ' '를 나타냄
//				System.out.print(' ');
//			for (int j = 1; j <= n - i; j++) // n-i+1개의 '*'를 나타냄
//				System.out.print('*');
//			System.out.println(); // 개행(줄변환)
//		}
	}

}

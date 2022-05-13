import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("오른쪽 아래가 직각인 삼각형");
		
		int n = 0;
		
		do {
			System.out.println("몇 단 삼각형입니까?");
			n = scan.nextInt();
		} while(n<=0);
		
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}

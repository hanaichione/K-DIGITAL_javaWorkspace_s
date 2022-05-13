import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("피라미드 모양 삼각형");
		
		int n;
		
		do {
			System.out.println("몇 단 삼각형입니까? ");
			n = scan.nextInt();
		} while(n<1);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i-1)*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

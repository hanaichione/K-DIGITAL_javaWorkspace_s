import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		int n;
//		int sum= 0;
//		
//		while(true) {
//			System.out.print("임의의 수 입력 : ");
//			n = scan.nextInt();
//			
//			if(n>0) break;
//		}
//		
//		for (int i = 1; i <= n; i++) {
//			sum += i;
//		}

		System.out.print("임의의 수 입력 : ");
		int num = scan.nextInt();
		int sum = 0;
		int i = num;

		while (i < 1) {
			System.out.print("1보다 큰 수 입력 : ");
			i = scan.nextInt();
		}

		while (1 <= i) {

			for (int j = 1; j <= i; j++) {
				sum += j;
			}
			break;

		}

		System.out.println("총합은 : " + sum);
	}

}

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int num;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("한 자리 정수값을 입력하시오. ");
			num = scan.nextInt();
		} while(num<1);
		
		for (int i = 1; i <= 100; i++) {
			if(i%num==0) {
				sum += i;
				if(i!=num) {
					System.out.print("+");
				}
				System.out.print(i);
			}
		}
		System.out.println(" = "+sum);
	}

}

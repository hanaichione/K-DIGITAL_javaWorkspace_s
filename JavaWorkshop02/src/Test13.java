import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두자리 정수를 입력하세요.");
		int n;
		do {
			System.out.print("입력 : ");
			n = scan.nextInt();
		}while(n<10||n>99);
		
		System.out.println("입력값은 "+n);
		
	}	// main 
}	// class

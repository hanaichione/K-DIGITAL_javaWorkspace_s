import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("1. 정수 입력하세요.");
//		String num_str = scan.next();
//		
//		System.out.println("2. 정수 입력하세요.");
//		String num_str2 = scan.next();
//		
//		int num1 = Integer.parseInt(num_str);
//		int num2 = Integer.parseInt(num_str2);
//		
//		int sum = num1+num2;
//		
//		System.out.println("정수 "+num1+"과 정수 "+num2+" 의 합계:"+sum);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.정수 입력하세요.");
		int n = scan.nextInt();
		System.out.println("2.정수 입력하세요.");
		int n2 = scan.nextInt();
		
		System.out.println("정수 "+n+" 과 정수 "+n2+" 의 합계: "+(n+n2));
	}

}

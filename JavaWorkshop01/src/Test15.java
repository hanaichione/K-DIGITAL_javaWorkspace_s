import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 정수 입력하세요.");
		String num_str = scan.next();
		
		System.out.println("2. 정수 입력하세요.");
		String num_str2 = scan.next();

		System.out.println("3. 정수 입력하세요.");
		String num_str3 = scan.next();

		
		int num1 = Integer.parseInt(num_str);
		int num2 = Integer.parseInt(num_str2);
		int num3 = Integer.parseInt(num_str3);
		
		
//		int max = (num1 > num2)?num1:num2;
//		max = (max > num3)?max:num3;
		
		int max = (num1>num2)?((num1>num3)?num1:num3):(num2>num3)?num2:num3;
		
		System.out.println("정수 "+num1+" 과 정수 "+num2+", 정수"+num3+" 중에서 최대값: "+max);

	}

}

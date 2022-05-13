import java.util.Scanner;

public class ScannerTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("이름 입력");
//		String name = scan.next();
//		System.out.println("입력한 이름은 : "+name);
//		
//		System.out.println("나이 입력");
//		int age = scan.nextInt();
//		System.out.println(name+"\t"+age);
		
		System.out.println("숫자");
		String str = scan.next();
		int num = Integer.parseInt(str);
		
		String message = (num%2==0)?"짝수":"홀수";
		System.out.println(message);
		
		scan.close();
	}

}

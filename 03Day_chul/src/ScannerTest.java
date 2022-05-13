import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 입력");
		String str1 = scan.next();
		System.out.println("두번째 입력");
		String str2 = scan.next();
		
		String message = (str1.equals(str2))?"이름이 같음":"이름이 다름";
		System.out.println(message);
		scan.close();
	}

}

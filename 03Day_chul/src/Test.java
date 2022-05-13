import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = scan.next();
		System.out.println("입력한 이름은 : "+name);
		
		System.out.println("나이 입력");
		String age = scan.next();
		System.out.println("입력한 나이는 : "+age);

		System.out.println("이름 : "+name+", 나이 : "+age);
	}

}

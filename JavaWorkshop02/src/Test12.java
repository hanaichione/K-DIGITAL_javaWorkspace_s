import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수값의 자릿수 구하기");
		
		int n = 0;
		while(true) {
			System.out.print("정수값 : ");
			n = scan.nextInt();
			if(n>0) break;
		}
		
		int no = 0;
		while (n>0) {
			n /= 10;
			no++;
		}
		
		System.out.println("그 수는 "+no+"자리입니다.");
		
	}

}

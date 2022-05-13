import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int max=0;
		
		System.out.println("세 정수의 최대값 구하기");
		
		System.out.print("a 값 : ");
		int a = scan.nextInt();
		
		System.out.print("b 값 : ");
		int b = scan.nextInt();
		
		System.out.print("c 값 : ");
		int c = scan.nextInt();
		
		if(a>=b && a>=c) max = a;
		if(b>a && b>=c) max = b;
		if(c>a && c>b) max = c;
		
//		int max = a;
//		if(b>max)max=b;
//		if(c>max)max=c;
		
		System.out.println("최대값은 "+max);
	}

}

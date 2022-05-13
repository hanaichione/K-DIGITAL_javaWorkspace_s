import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 100; i++) {
			if (i%3==0) System.out.println(i+" foo");
			else if (i%5==0) System.out.println(i+" bar");
			else if (i%7==0) System.out.println(i+" baz");
			else System.out.println(i);
		}
	}

}

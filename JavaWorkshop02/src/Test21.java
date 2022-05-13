import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i = 1; i <= 100; i++) {
//			if(i<10) System.out.print(" ");
//			System.out.print(i+" ");
//			if(i%10==0) {
//				System.out.println();
//			}
//		}

		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int sum = 10 * i + j;
				if (i == 0 && j !=10)	
					System.out.print(" ");
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}

}

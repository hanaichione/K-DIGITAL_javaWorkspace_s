import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		char spel [] = new char[5];
		spel[0] = 'A';
		spel[1] = 'B';
		spel[2] = 'C';
		spel[3] = 'D';
		spel[4] = 'E';
		
		for (int i = 0; i < spel.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(spel[j]);
			}
			System.out.println();
		}
		
//		for (char i = 'A'; i <= 'E'; i++) {
//			for (char j = 'A'; j <= i; j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
	}

}

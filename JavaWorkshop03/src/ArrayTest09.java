import java.util.Random;
import java.util.Scanner;

public class ArrayTest09 {

	public static void main(String[] args) {

		int arr3 [] = new int[5];
		Random ran = new Random();
		int sum = 0;
		
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = 1+ran.nextInt(9);
			sum += arr3[i];
			System.out.print(arr3[i]+" ");
		}
		System.out.println();
		System.out.println("sum="+sum);
		System.out.println("avg="+(float)sum/arr3.length);

	} // main 끝
}

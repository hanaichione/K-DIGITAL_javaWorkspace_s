import java.util.Random;
import java.util.Scanner;

public class ArrayTest08 {

	public static void main(String[] args) {

		int [] score = new int[] {99, 24, 67, 22, 11, 9};
		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {
			if(max<score[i]) max = score[i];
			if(min>score[i]) min = score[i];
		}
		
		System.out.println("최댓값:"+max);
		System.out.println("최솟값"+min);

	} // main 끝
}

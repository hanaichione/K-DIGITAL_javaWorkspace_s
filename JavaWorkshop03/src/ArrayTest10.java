import java.util.Random;
import java.util.Scanner;

public class ArrayTest10 {

	public static void main(String[] args) {

		if(args.length != 2) {							// 두 개의 숫자를 입력하지 않았을 때
			System.out.println("다시 입력하세요.");
		} else {											// 두개를 입력했을 때
			int inx = Integer.parseInt(args[0]);
			int jnx = Integer.parseInt(args[1]);
			
			if(inx>5 || inx<1 || jnx>5||jnx<1) {			// 두 숫자 중 하나라도 1~5 사이의 수가 아닐 때
				System.out.println("숫자를 확인하세요.");
			} else {										// 두 숫자 모두 1~5 사이일 떄
				int [][] arr = new int[inx][jnx];			// 첫번째 숫자를 행, 두번째 숫자를 열로 하여 2차원 배열 형성
				double sum = 0;
				
				for (int i = 0; i < arr.length; i++) {	// 배열에 랜덤값 넣기
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (int)(Math.random()*5)+1;
					}
				}
				
				for (int i = 0; i < arr.length; i++) {	// 모든 배열 데이터의 합계 구하기
					for (int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j]+" ");
						sum += arr[i][j];
					}
					System.out.println("");
				}
				System.out.println(" ");
				System.out.println("sum = "+sum);
				System.out.println("avg = "+ (sum/(arr.length*arr[0].length)));
			}
		}
	} // main 끝
}

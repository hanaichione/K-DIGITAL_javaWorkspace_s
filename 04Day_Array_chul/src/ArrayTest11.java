
public class ArrayTest11 {

	public static void main(String[] args) {
		
		int [][] num = new int[][] {{10,20,30}, {40}, {50,60}};
		
		for (int[] is : num) {
			for (int is2 : is) {
				System.out.println(is2);
			}
		}
	}	// main 끝

}


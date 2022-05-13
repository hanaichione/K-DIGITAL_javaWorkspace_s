
public class Test02 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		while (num <= 20) {
			if ((num % 2 != 0) && (num % 3 != 0)) {
				sum += num;
			}
			num++;
		}
		System.out.println("sum = "+sum);
	}
}

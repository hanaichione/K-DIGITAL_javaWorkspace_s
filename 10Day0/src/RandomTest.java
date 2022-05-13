import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random ran = new Random();
		int n = ran.nextInt();
		int m = ran.nextInt();
		int z = ran.nextInt(10);	// 0부터 n-1까지의 난수(정수)
		System.out.println(n);
		System.out.println(m);
		System.out.println(z);
	}

}

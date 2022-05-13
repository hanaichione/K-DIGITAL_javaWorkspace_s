
public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				for (int j2 = 1; j2 <= 6; j2++) {
					if ((i * j * j2) % 3 == 0) {
						System.out.println(i + "*" + j + "*" + j2 + "=" + (i * j * j2));
					}
				}
			}
		}
	}

}

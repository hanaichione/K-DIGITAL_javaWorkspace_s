
public class EnumTest3 {
	//상수
		public enum Color {BLUE, RED, YELLOW}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Color c = Color.BLUE;
		Color c2 = Color.RED;
		Color c3 = Color.YELLOW;
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(c3);
		
		Color [] xx = Color.values();
		for (Color p : xx) {
			System.out.println(p.name()+"\t"+p.ordinal());
		}

	}

}

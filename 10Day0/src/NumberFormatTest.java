import java.text.NumberFormat;

public class NumberFormatTest {
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String mesg = nf.format(987654321);
		System.out.println(mesg);
	}
}

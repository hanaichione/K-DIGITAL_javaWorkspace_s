import java.text.DecimalFormat;

public class DecimalFormatTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat();
		
		String mesg = df.format(987654321);
		System.out.println(mesg);
		
		DecimalFormat df2 = new DecimalFormat("###,###");
		Number xxx = df2.parse("987,654");
		System.out.println(xxx);
	}

}
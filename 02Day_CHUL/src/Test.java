import java.math.BigDecimal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n=2.0;
		double n2=1.1;
		
		System.out.println(n-n2);
		
		BigDecimal m = new BigDecimal("2.0");	// ctrl+shift+o : 메서드가 속한 api 포함시켜줌
		BigDecimal m2 = new BigDecimal("1.1");
		System.out.println(m.subtract(m2));
	}

}

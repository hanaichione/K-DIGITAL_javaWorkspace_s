package Workshop06.calc;

public class Calculator {
	
	double result = 0.0;

	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public double plus(int a, int b) {
		result=(double)(a+b);
		return result;
	}
	
	public double minus(int a, int b) {
		result=(double)(a-b);
		return result;
	}
	
	public double multiplication(int a, int b) {
		result=(double)(a*b);
		return result;
	}
	
	public double divide(int a, int b) {
		result=(double)(a/b);
		return result;
	}
}

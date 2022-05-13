package calc;

import java.util.Scanner;

public class TestCalc {

	public static void main(String [] args) {
		// TODO Auto-generated method stub

		Calc c = new Calc();
		int num = Integer.parseInt(args[0]);
		int result = c.calculate(num);
		System.out.println("결과: "+result);
	}

}

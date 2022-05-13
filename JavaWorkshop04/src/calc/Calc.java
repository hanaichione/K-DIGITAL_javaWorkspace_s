package calc;

import java.util.Scanner;

public class Calc {
	public int data;

	public Calc() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Calc(int data) {
		super();
		this.data = data;
	}

	public int calculate(int num) {
		int sum = 0;
		while (true) {
			if (num < 5 && num > 10) {
				System.out.println("다시 입력하세요.");
				Scanner scan = new Scanner(System.in);
				num = scan.nextInt();
			} else {
				for (int i = 2; i <= num; i += 2) {
					sum += i;
				}
				break;
			}
		}
		return sum;
	}
}

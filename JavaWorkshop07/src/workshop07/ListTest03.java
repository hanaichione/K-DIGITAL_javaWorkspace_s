package workshop07;

import java.util.ArrayList;

public class ListTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list1 = new ArrayList<>();
		ArrayList list2 = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			int num1 = (int) (Math.random() * 10);
			int num2 = (int) (Math.random() * 10);

			list1.add(num1);
			list2.add(num2);

			int list1num = (int) list1.get(i);
			int list2num = (int) list2.get(i);

			try {
				System.out.print(list1num + "/" + list2num);
				System.out.println(" " + (list1num / list2num));
			} catch (Exception e) {
				System.out.println(" 분모가 0입니다.");
			}
		}

	}

}

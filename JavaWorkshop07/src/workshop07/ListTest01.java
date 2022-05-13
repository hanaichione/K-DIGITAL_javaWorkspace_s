package workshop07;

import java.util.ArrayList;

public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 10;
		
		MakeList makeList = new MakeList();
		makeList.makeArrayList(size);
		
		ArrayList<Integer> list = null;
		
		list = makeList.getList();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		System.out.println("평균 : "+makeList.getAverage());
	}

}

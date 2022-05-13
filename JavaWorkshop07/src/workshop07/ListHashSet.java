package workshop07;

import java.util.ArrayList;
import java.util.HashSet;

public class ListHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = Integer.parseInt(args[0]);
		ArrayList<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < size; i++) {
			int num = (int)(Math.random()*10 + 1);
			list.add(num);
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < size; i++) {
			set.add(list.get(i));
		}
		
		System.out.println(set);
	}

}

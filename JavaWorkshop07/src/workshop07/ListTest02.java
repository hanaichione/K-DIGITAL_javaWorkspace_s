package workshop07;

import java.util.ArrayList;

public class ListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {3,4,2,5,2,3,6,7,5,7,9};
		ConvertList convert = new ConvertList();

		ArrayList<Integer> list = convert.convertList(array);
		
//		for (Integer integer : list) {
//			System.out.print(integer+" ");
//		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

package workshop07;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "JavaProgramming";
		char[]chararr = str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < chararr.length; i++) {
			set.add(chararr[i]);
		}
		System.out.println(set);
	}

}

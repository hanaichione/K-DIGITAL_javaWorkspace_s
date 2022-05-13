import java.util.Collections;
import java.util.TreeSet;

public class ListTest5 {

	public static void main(String[] args) {

		TreeSet<String> s =
				new TreeSet<String>(Collections.reverseOrder());
		s.add("hello");
		s.add("aello");
		s.add("bello");
		s.add("xello");
		s.add("pello");
		
		System.out.println(s);
	}

}

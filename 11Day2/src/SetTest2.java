import java.util.HashSet;
import java.util.Iterator;

public class SetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String으로 타입 고정
		HashSet<String> set = new HashSet<>();
		
		set.add("1");
		set.add("2");
		set.add("3");
		set.add("4");
		set.add("5");
//		set.add(10);	// 잘못된 데이터 저장 감지, 컴파일 때 인식 가능
		
		// 1. toString
		System.out.println(set);
		
		// 2. for each
		for (String x : set) {
			System.out.println(x);
		}
		
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			String m = ite.next();
			System.out.println(">>"+m);
		}
	}

}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("강감찬");
		list.add("세종");
//		list.add(100);
		
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		System.out.println("================================");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			String t = list.get(i);	// generic 쓰고 있기 때문에 형변환이 필요 없음
		}
		System.out.println("================================");
		
		for (String s : list) {
			System.out.println(s);
		}
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String k = ite.next();
			System.out.println(">>" +k);
		}
	}

}

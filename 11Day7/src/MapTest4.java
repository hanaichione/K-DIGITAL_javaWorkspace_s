import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map = new HashMap<>(); 
		map.put("one", "홍길동");
		map.put("two", "이순신");
		map.put("three", "유관순");

		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));

		// 메서드
		System.out.println("크기:" + map.size());
		System.out.println("키 포함 여부:" + map.containsKey("one"));
		System.out.println("값 포함 여부:" + map.containsValue("유관순"));

		map.replace("three", "강감찬");
		map.remove("two");	// key값 "one", "two"만 남음
		
		System.out.println(map);
		System.out.println("==========================");
		
		
		// *************** 키값을 이용해 map 순회
		Set<String> keys = map.keySet();
		System.out.println(keys);
		for (String key : keys) {
			System.out.println(key+"\t"+map.get(key));
		}
		
		System.out.println("+++++++++++++++++++++++");
		
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()) {
			String k = ite.next();
			System.out.println(">>" +k +"\t"+map.get(k));
		}
	}

}

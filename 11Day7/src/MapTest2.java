import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> map = new HashMap<>();	
		map.put("one", "홍길동");
		map.put("two", "이순신");
		map.put("three", "강감찬");
		map.put("one", "강감찬");
		map.put("one", null);
		map.put(null, null);
		map.put(null, "aaa");
		
		System.out.println(map.get("one"));
		System.out.println(map.get("two"));
		System.out.println(map.get("three"));
		System.out.println(map.get("four"));	// 3.14라는 키값이 없음
		System.out.println(map.get(null));
		System.out.println(map.size());
	}

}

import java.util.HashMap;
import java.util.Set;

public class MapTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Person> map = new HashMap<>(); // 다형성
		map.put("one", new Person("홍길동", 20, "서울"));
		map.put("two", new Person("이순신", 30, "전라"));
		map.put("three", new Person("유관순", 40, "서울"));

		// get(key)
		System.out.println(map.get("one").getName());
		Person one = map.get("one");
		System.out.println(one.getName());

		System.out.println("=========================");

//		Set<String> keys = map.keySet();
//		for (String k : keys) {
//			Person p = map.get(k);
//			System.out.println(k + "\t" + p.getName());
//		}
		
		// keySet()
		Set<String> keys = map.keySet();
		for (String key : keys) {
			Person p = map.get(key);
			System.out.println(p.getName());
		}
//
//		System.out.println("=========================");
//		
//		for (String k : keys) {
//			System.out.println(map.get(k).getName());
//		}
	}

}

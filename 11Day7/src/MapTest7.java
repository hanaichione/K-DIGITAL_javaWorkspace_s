import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class MapTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Person> map = new HashMap<>();
		map.put("one", new Person("홍길동1", 20, "서울"));
		map.put("two", new Person("홍길동2", 30, "전라"));
		map.put("three", new Person("홍길동3", 40, "서울"));

		HashMap<String,Person> map2 = new HashMap<>();
		map2.put("one", new Person("이순신1", 200, "서울2"));
		map2.put("two", new Person("이순신2", 300, "전라2"));
		map2.put("three", new Person("이순신3", 400, "서울2"));

		ArrayList<HashMap<String,Person>> list = 
				new ArrayList<>();
		
		list.add(map);
		list.add(map2);
		
		for (HashMap<String, Person> x : list) {
			Set<String> keys = x.keySet();
			for (String k : keys) {
				Person p = x.get(k);
				System.out.println(p.getName()+"\t"+p.getAge());
			}
		}
	}

}

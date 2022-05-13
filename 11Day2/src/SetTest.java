import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set set = new HashSet();	// HashSet은 Set의 자식(다형성), 제네릭 사용 안 함
		set.add("1");
		set.add("2");
		set.add(3);
		
		System.out.println("길이: " + set.size());
		System.out.println("포함여부: " + set.contains("1"));
		System.out.println("empty: " + set.isEmpty());
		set.remove("1");
		Object[] xxx= set.toArray();
		System.out.println(set.toString());
		for (Object o : xxx) {
			System.out.println(o);
		}
		set.clear();
		System.out.println(set);
	}
}

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest3 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		Person kkk = new Person("유관순", 17, "서울");
		set.add(new Person("홍길동", 20, "서울"));
		set.add(new Person("이순신", 44, "전라"));
		set.add(new Person("이순신", 44, "전라"));
		set.add(kkk);
		set.add(kkk);
		System.out.println(set);

		for (Person x : set) {
			System.out.println(x.getName());
		}

		System.out.println("=================");

		Iterator<Person> iterator = set.iterator();
		while (iterator.hasNext()) {
			Person P = iterator.next();
			System.out.println(P);

		}
	}

}

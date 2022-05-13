import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest4 {

	public static void change(int num) {
		num = 10;
	}
	
	private static void change2(int m2) {
		// TODO Auto-generated method stub
		m2 = 100;
	}
	
	private static void change3(int[] i) {
		// TODO Auto-generated method stub
		i[0] = 100;
	}
	
	private static void change4(HashSet<String> set) {
		// TODO Auto-generated method stub
		set.remove("홍길동");
	}

	public static void main(String[] args) {
		int m = 9;
		System.out.println("변경전: " + m);
		change(m);
		System.out.println("변경후: " + m);
		
		int[]m2 = {9,8,7};
		System.out.println("변경전 : "+m2[0]);
		change2(m2[0]);
		System.out.println("변경후 : "+m2[0]);
		
		System.out.println("변경전 : "+m2[0]);
		change3(m2);
		System.out.println("변경후 : "+m2[0]);
		
		HashSet<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
		System.out.println("변경 전 : "+set);
		change4(set);
		System.out.println("변경 후 : "+set);
	}

	

	

	
	
	

}

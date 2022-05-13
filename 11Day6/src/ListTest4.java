import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest4 {

	public static void main(String[] args) {

		List<String> list = new ArrayList();
		list.add("홍길동");
		list.add("이순신");
		list.add("세종");

		/// 쓸일 진짜 많은 코드라고 하네,,, 외워두라고 하네,,,
		List<String> list2 = Arrays.asList("홍길동", "이순신", "세종", "세종"); // list로 변환
		System.out.println(list);
		System.out.println(list2);
		System.out.println(list2.size());
	}

}

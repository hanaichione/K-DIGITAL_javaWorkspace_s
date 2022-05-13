package Workshop06.token;

import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "4,2,3,6,7";
		int sum = 0;

		StringTokenizer st = new StringTokenizer(str, ",");
		while (st.hasMoreElements()) { // hasMoreElements 다음 토큰의 존재 여부를 검사
			sum += Integer.parseInt(st.nextToken()); // 있으면 다음 토큰을 꺼내올 수 있음
		}
		System.out.println(sum);
	}

}

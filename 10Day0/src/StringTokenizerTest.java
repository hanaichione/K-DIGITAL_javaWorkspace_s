

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// "aa/bb/cc" ==> / 구분자로 값을 반환
		String data = "aa/bb/cc,dd/ee/xx,kk/yy/zz mm";
		String [] d = data.split("/");	// 구분자 하나만 가능
		for (String string : d) {
			System.out.println(string);
		}
		
		System.out.println("===============================");
		
		StringTokenizer st = new StringTokenizer(data, "/ ,");
		while(st.hasMoreElements()) {	// hasMoreElements 다음 토큰의 존재 여부를 검사
			System.out.println(st.nextToken());	// 있으면 다음 토큰을 꺼내올 수 있음
		}
	}

}

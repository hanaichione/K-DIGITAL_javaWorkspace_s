package Workshop06.string;

import java.util.StringTokenizer;

public class StringTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am second to none";
		char chararr[] = str.toCharArray();
		StringTokenizer st = new StringTokenizer(str, " ");
		int charCount = 0;
		
		for (int i = 0; i < chararr.length; i++) {
			if(chararr[i] == ' ') {
				continue;
			}
			
			System.out.print(chararr[i]+" ");
			charCount++;
		}
		
		System.out.println("문자갯수 : " + charCount);
		
		int wordCount = 0;
		
		while (st.hasMoreElements()) {
			wordCount++;
			System.out.print(st.nextToken()+" ");
		}
		System.out.println("단어갯수 : " + wordCount);
	}

}

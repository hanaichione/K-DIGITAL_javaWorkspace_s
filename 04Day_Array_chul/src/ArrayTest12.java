
public class ArrayTest12 {

	public static void main(String[] args) {
		
		for (String string : args) {
			System.out.println(string);
		}
		
		System.out.println("==================================");
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
	}	// main 끝

}


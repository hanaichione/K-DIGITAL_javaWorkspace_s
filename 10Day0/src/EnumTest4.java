
public class EnumTest4 {
	// 상수
	public enum DML {
		SELECT, INSERT, DELETE
	}

//	public static final int SELECT = 1;// 상수 클래스이름 .상수이름 사용
//	public static final int INSERT = 2;
//	public static final int DELETE = 3;

	public static void check(DML num) {
		// byte,short,int,char,String ,enum
		switch (num) {
		case SELECT:
			System.out.println("SELECT");
			break;
		case INSERT:
			System.out.println("INSERT");
			break;
		case DELETE:
			System.out.println("DELETE");
			break;
		default:
			System.out.println("default");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// enum는 상수 대체 가능
		check(DML.SELECT); // 1.SELECT 2:INSERT 3;DELETE
		check(DML.INSERT);
		check(DML.DELETE);
//		check(99);// 1,2,3 값만 사용 하고 그외 값은 넘어가지 못하도록

	}

}

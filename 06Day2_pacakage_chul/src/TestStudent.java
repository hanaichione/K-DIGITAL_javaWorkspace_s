import java.util.Calendar;
import java.util.Random;
import com.xxx.Student;

// import com.xxx.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 객체에 패키지 찍어주기
		com.xxx.Student s = new com.xxx.Student();
		System.out.println(s.name);
		
		// 2. import
		Student ss = new Student();
		
		Random r = new Random();
		
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		
		com.yyy.Student sss = new com.yyy.Student();
		System.out.println(sss.name);
	}

}

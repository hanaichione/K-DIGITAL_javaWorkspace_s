import java.io.IOException;
import java.sql.SQLException;

class A{
	
	public void a() throws ArithmeticException {}
	public void b() 
			throws ArithmeticException,NullPointerException {}
	public void c() 
			throws IOException {}
}

class B extends A{
	@Override
	public void a() throws ArithmeticException  {}
	
	//RuntimeException
	public void b() throws ClassCastException{}
	//public void c() throws SQLException{} //계열이 다름
}


public class ExceptionTest10 {

	
	public static void main(String[] args) {
		
	}
}

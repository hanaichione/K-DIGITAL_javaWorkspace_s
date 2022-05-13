import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_delete_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";

		Connection con = null;
		Statement stmt = null;		// exception이 발생하지 않으면 자동으로 commit
		
		try {
			Class.forName(driver);
			System.out.println("로딩 성공");

			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("접속 성공");

			int deptno = 90;
			String sql = "delete from dept where deptno="+deptno;
			System.out.println(sql);
			
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			// 묵시적 con.commit(); 자동 커밋이 이루어짐
			System.out.println("실행된 레코드 갯수 : " + result);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			try {
				//7. 자원반납
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

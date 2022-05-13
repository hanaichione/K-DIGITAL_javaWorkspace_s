import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_Insert_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";

		Connection con = null;
		Statement stmt = null;

		ResultSet rs = null; // select 결과만 저장, executeQuery
		// insert, delete, update : dml 결과는 영향받은 레코드 갯수(int) 리턴
		// executeUpdate("dml sql") => 레코드 갯수
		try {
			Class.forName(driver);
			System.out.println("로딩 성공");

			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("접속 성공");

			int deptno = 89;
			String deptname = "개발";
			String loc = "서울";
			String sql = "insert into dept (deptno,dname,loc) " + "values (" + deptno + ", '" + deptname + "','" + loc
					+ "')";
			System.out.println(sql);
			
			stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("insert된 레코드 갯수 : " + result);
			String sql2 = "select deptno, dname, loc from dept";
			
			rs = stmt.executeQuery(sql2);//select문실행
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+ rs.getString(2)+":"+rs.getString(3));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//7. 자원반납
				if(rs!=null) rs.close();
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Statement_update_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";

		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			System.out.println("로딩 성공");

			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("접속 성공");

			int deptno = 90;
			String dname = "영업";
			String loc = "제주";
			String sql = "update dept set dname='"+dname+"', loc='"+loc+"'"+" where deptno=" +deptno;
			System.out.println(sql);
			
			stmt = con.createStatement();
			
			int result = stmt.executeUpdate(sql);
			
			String sql2 = "select * from dept where deptno=" + deptno;
			ResultSet rs = stmt.executeQuery(sql2);

			if(rs.next()) {
				System.out.println(rs.getInt(1)+":"+ rs.getString(2)+":"+rs.getString(3));
			}
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

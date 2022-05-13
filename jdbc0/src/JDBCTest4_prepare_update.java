import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest4_prepare_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			
			String sql = "update dept set dname = ?, loc = ? where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "영업");
			pstmt.setString(2, "부산");
			pstmt.setInt(3, 14);
			int num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 개수 : " + num);
			pstmt.close();
			
			String sql2 = "select * from dept";
			pstmt = con.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.getStackTrace();
			}
		}
	}	// end main
}	// end class

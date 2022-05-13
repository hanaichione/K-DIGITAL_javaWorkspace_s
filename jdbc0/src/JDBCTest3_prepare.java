import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest3_prepare {

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

			String sql = "insert into dept values (?, ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, 13);
			pstmt.setString(2, "개발");
			pstmt.setString(3, "부산");
			int num = pstmt.executeUpdate();
			System.out.println(num);
			pstmt.setInt(1, 14);
			pstmt.setString(2, "개발2");
			pstmt.setString(3, "서울");
			int num2 = pstmt.executeUpdate();
			System.out.println("실행된 레코드 개수 : " + (num + num2));

			pstmt.close();

			String sql3 = "select * from dept";
			pstmt = con.prepareStatement(sql3);
			rs = pstmt.executeQuery(sql3);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.getStackTrace();
			}
		}	// end finally
	}	// end main
}	// end class

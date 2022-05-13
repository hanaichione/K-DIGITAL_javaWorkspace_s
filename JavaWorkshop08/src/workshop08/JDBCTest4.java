package workshop08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest4 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String pass = "test";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);

			con.setAutoCommit(false);

			String sql = "delete from product "+"where factno = (select factno from factory where facloc = 'CHANGWON')";

			pstmt = con.prepareStatement(sql);
			int num = pstmt.executeUpdate();

			System.out.println(num + "개의 데이터가 정상적으로 DELETE 되었습니다.");

			con.commit();

		} catch (Exception e) {

			e.printStackTrace();

			try {
				con.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

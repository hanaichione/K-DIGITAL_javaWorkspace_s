import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest_prepare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 정보
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";

		// 2. 드라이버 생성
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			// 3. 드라이버 로딩
			Class.forName(driver);
			System.out.println("===드라이버 로딩 성공===");
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("===접속 성공 : " + con + "===");

			// 4. sql문 작성
//			String sql = "select deptno x, dname, loc from dept where dname=? and loc=?";
			// 문자열이 오면 자동으로 ? 부분에 ' ' 붙여줌
			// 단점 : sysout으로 최종 sql문 확인 불가
			String sql = "select deptno x, dname, loc from dept where deptno=?";

			// 5. SQL 실행
			pstmt = con.prepareStatement(sql); // ?가진 sql을 포함한 preparedStatement 생성

			// 6. ? 에 들어갈 값을 지정 후 실행해서 결과 받기
//			pstmt.setString(1, "ACCOUNTING"); // dname = ? 에 해당
//			pstmt.setString(2, "NEW YORK"); // loc = ? 에 해당
			pstmt.setInt(1, 40);

			rs = pstmt.executeQuery(); // select 실행 후 ResultSet으로 결과 받기

			while (rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				System.out.println(deptno + "\t" + dname + "\t" + loc);
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
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.getStackTrace();
			}
		}
	} // end main
} // end class

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest2_prepare {

	public static void main(String[] args) {	
		// main에서 호출 중, jdk로 위임
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "scott";
		String passwd = "tiger";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			System.out.println("드라이브 로딩 성공");
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("접속 성공");
			
			String sql = "insert into dept (deptno, dname, loc)" + " values (?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, 12);
			pstmt.setString(2, "개발");
			pstmt.setString(3, "서울");
			
			int num = pstmt.executeUpdate();
			System.out.println(num + "개의 행이 입력되었습니다.");
		
			pstmt.close();
			
			String sql2 = "select deptno, dname, loc from dept where deptno=?";
			pstmt = con.prepareStatement(sql2);
			pstmt.setInt(1, 12);
			rs = pstmt.executeQuery();
			rs.next();	// if문 안 해도 가능
				System.out.println(rs.getInt(1) +"\t" + rs.getString(2)+"\t"+rs.getString(3));
			
			if(rs.next()) {
				System.out.println(rs.getInt(1) +"\t" + rs.getString(2)+"\t"+rs.getString(3));
			}
			
		} catch (ClassNotFoundException e) {	// compile 에러
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(con!=null) con.close();
				if(pstmt!=null) pstmt.close();
				
			} catch (SQLException e) {
				// TODO: handle exception
				e.getStackTrace();
			}
		}
		
	}

}

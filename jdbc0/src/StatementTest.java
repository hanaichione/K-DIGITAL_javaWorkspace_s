import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 네가지 정보(항상 동일)
		String driver = "oracle.jdbc.driver.OracleDriver"; // jdbc 드라이버 이름
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속할 db 정보, 127.0.0.1=localhost
		// 1521 포트번호, xe sid(developer에 있음)
		String userid = "scott"; // 계정
		String passwd = "tiger"; // pw
		
		// 2. 드라이버 생성 => new 이용
		Connection con = null; // url 이용 db 접속 개체
		Statement stmt = null; // 접속 후 sql 실행 개체, Statement(구), PreparedStatement(신)
		ResultSet rs = null; // 실행된 sql의 결과를 저장(select 결과만 저장)
		
		// insert, delete, update : dml 결과는 영향을 받은 레코드 개수 int로 리턴
		// executeUpdate("dml", "sql");

		// 2.1 드라이버 로딩
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공============");

			// 3. 오라클 연결(Connection 연결) - 접속 성공시 Connection 객체 생성
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("db 접속 성공 : " + con);

			// 4. sql 작성
//			String sql = "select deptno x, dname, loc from dept";
			int deptno = 89;
			String deptname = "개발";
			String loc = "서울";
			String sql = "insert into dept (deptno, dname, loc) "
					+ "values ("+deptno+", '"+deptname+"', '"+loc+"')";
			System.out.println(sql);

			// 5. sql 실행 준비 => Statement, con에서 실행할 Statement 객체 얻기
			stmt = con.createStatement();

			// 6. Statement 이용해서 sql 실행 후 결과를 받기
			int result = stmt.executeUpdate(sql);	// insert문 실행
			System.out.println("insert 된 레코드 갯수 : " + result);
//			rs = stmt.executeQuery(sql); // select문은 executeQuery 함수 이용
											// insert, update, delete는 executeUpdate(sql) 함수 이용
			String sql2 = "select deptno, dname, loc from dept";
			rs = stmt.executeQuery(sql2);

			// 7. 컬럼 이름 이용, 데이터 꺼내오기
			while (rs.next()) {
//				int deptno = rs.getInt("x");
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//				System.out.println(deptno + "\t" + dname + "\t" + loc);
				System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getString(3));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패============");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 8. 자원반납 반대순서로 실행
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}	// end main
}	// end class

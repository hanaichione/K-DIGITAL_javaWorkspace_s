package cmo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleDAO {
	// 1. 4가지 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";

	public OracleDAO() {
		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}

	}

	public ArrayList<Dept> select() throws SQLException {
		ArrayList<Dept> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = DriverManager.getConnection(url, userid, passwd);

		String sql = "select deptno x, dname, loc from dept";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			int deptno = rs.getInt("x");
			String dname = rs.getString(2);
			String loc = rs.getString(3);
			Dept dto = new Dept(deptno, dname, loc);
			list.add(dto);
		}
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();

		return list;
	}

	public int insert(Dept xx) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;

		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "insert into dept(deptno, dname, loc)" + " values (?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, xx.getDeptno());
			pstmt.setString(2, xx.getDname());
			pstmt.setString(3, xx.getLoc());
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.getStackTrace();
		} finally {
			try {
				// 7. 자원반납
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.getStackTrace();
			}
		}
		return num;
	}

	public int update(Dept xx) throws RecordNotFoundException {
		Connection con = null;
		PreparedStatement pstmt = null;

		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "update dept set dname=?, loc=? where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, xx.getDname());
			pstmt.setString(2, xx.getLoc());
			pstmt.setInt(3, xx.getDeptno());
			num = pstmt.executeUpdate();
			System.out.println("실행결과" + num);
			if (num==0) {	// 업데이트할 행을 찾지 못함
				throw new RecordNotFoundException(xx.getDeptno()+"번 레코드가 없음");
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				// 7. 자원반납
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return num;
	}

	public int delete(int i) {
		Connection con = null;
		PreparedStatement pstmt = null;

		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "delete from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				// 7. 자원반납
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return num;
	}


//	public ArrayList<Dept> selectDeptno(int i) {
//		// TODO Auto-generated method stub
//		ArrayList<Dept> list = new ArrayList<>();
//		Connection con = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			con = DriverManager.getConnection(url, userid, passwd);
//			
//			String sql = "select deptno, dname, loc from dept where deptno = ?";
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, i);
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				Dept dto = new Dept(deptno, dname, loc);
//				list.add(dto);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				if (rs != null)
//					rs.close();
//				if (pstmt != null)
//					pstmt.close();
//				if (con != null)
//					con.close();
//			} catch (SQLException e) {
//				// TODO: handle exception
//				e.getStackTrace();
//			}
//		}
//		return list;
//	}
	
	public Dept selectDeptno(int i) throws SQLException {
		Dept dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = DriverManager.getConnection(url, userid, passwd);

		String sql = "select deptno x, dname, loc from dept where deptno = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, i);
		rs = pstmt.executeQuery();
		while (rs.next()) {
			int deptno = rs.getInt("x");
			String dname = rs.getString(2);
			String loc = rs.getString(3);
			dto = new Dept(deptno, dname, loc);
		}
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();

		return dto;
	}
	
}

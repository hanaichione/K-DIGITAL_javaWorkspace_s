package cmo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

public class OracleTXDAO {
	

	public OracleTXDAO() {
	}

	public ArrayList<Dept> select(Connection con) throws SQLException {
		ArrayList<Dept> list = new ArrayList<>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
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
		return list;
	}

	public int insert(Connection con, Dept xx) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;

		int num = 0;
		try {
			String sql = "insert into dept(deptno, dname, loc)" + " values (?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, xx.getDeptno());
			pstmt.setString(2, xx.getDname());
			pstmt.setString(3, xx.getLoc());
			num = pstmt.executeUpdate();
			System.out.println("insert 실행 결과 = " + num);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				// 7. 자원반납
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return num;
	}

	public int update(Connection con, Dept xx) throws RecordNotFoundException {
		
		PreparedStatement pstmt = null;

		int num = 0;
		try {
			
			String sql = "update dept set dname=?, loc=? where deptno=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, xx.getDname());
			pstmt.setString(2, xx.getLoc());
			pstmt.setInt(3, xx.getDeptno());
			num = pstmt.executeUpdate();
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
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return num;
	}

	public int delete(Connection con, int i) {
		
		PreparedStatement pstmt = null;

		int num = 0;
		try {
			String sql = "de from dept where deptno = ?";
//			String sql = "delete from dept where deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, i);
			num = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			
			try {
				System.out.println("in dao.delete Rollback================");
				con.rollback();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				// 7. 자원반납
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return num;
	}
	
}

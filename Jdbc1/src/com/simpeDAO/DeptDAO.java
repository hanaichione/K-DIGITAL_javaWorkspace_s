package com.simpeDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeptDAO { // db 접속, sql 실행 시킴

	// 1. 네가지 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";

	public DeptDAO() {
		super();

		try {
			Class.forName(driver);
			System.out.println("드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	} // end 생성자

	public ArrayList<DeptDTO> selectAllDept() { // 전체 레코드 select
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<DeptDTO> list = new ArrayList<>(); // try문 밖에 있어야 finally 밖에서 return 가능

		// **** 패턴 외우기
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("conn 연결 성공 : " + con);

			String sql = "select deptno x, dname, loc from dept";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int deptno = rs.getInt("x");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
//				System.out.println(deptno + "\t" + dname + "\t" + loc);
				DeptDTO dto = new DeptDTO(deptno, dname, loc); // 뽑아온 데이터로 DeptDTO 객체 생성
				list.add(dto); // list에 추가
			}
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
		} // end finally
		return list;

	} // end selectAllDept

	public int insertDept(DeptDTO dto) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		int num = 0;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			System.out.println("conn 연결 성공 : " + con);
			
			String sql = "insert into dept (deptno, dname, loc)" + " values (?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			num = pstmt.executeUpdate();
			System.out.println("실행된 레코드 갯수 : " + num);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.getStackTrace();
			}
		}	// end finally
		return num;
	}	// end insertDept

}	// end class

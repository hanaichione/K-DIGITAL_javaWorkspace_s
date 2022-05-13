package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

import cmo.dao.OracleTXDAO;

public class OracleTXService {
	// 1. 4가지 정보
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "scott";
	String passwd = "tiger";
	OracleTXDAO dao;

	public OracleTXService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleTXDAO();
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
		Connection con = null;
		ArrayList<Dept> list = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
//			System.out.println("in service. select() conn = " + con);	// select 만들고 접속 잘 되나 확인
			list = dao.select(con);
		} finally {
			if (con != null)
				con.close();
		}
		return list;
	}

	public int insert(Dept xx) {
		Connection con = null;
		ArrayList<Dept> list = null;
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			num = dao.insert(con, xx);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return num;
	}

	public int update(Dept xx) throws RecordNotFoundException {
		Connection con = null;
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			num = dao.update(con, xx);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return num;
	}

	public int delete(int i) {
		Connection con = null;
		int num = 0;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			num = dao.delete(con, i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return num;
	}

} // end class

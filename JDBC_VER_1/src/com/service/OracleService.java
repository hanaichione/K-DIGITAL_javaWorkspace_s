package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;

import cmo.dao.OracleDAO;

public class OracleService {
	OracleDAO dao;

	public OracleService() {
		super();
		// TODO Auto-generated constructor stub
		dao = new OracleDAO();
	}

	public ArrayList<Dept> select() throws SQLException {
		ArrayList<Dept> list = dao.select();
		return list;
	}

	public int insert(Dept xx) {
		int num = dao.insert(xx);
		return num;
	}

	public int update(Dept xx) throws RecordNotFoundException {
		int num = dao.update(xx);
		return num;
	}

	public int delete(int i) {
		int num = dao.delete(i);
		return num;
	}

//	public ArrayList<Dept> selectDeptno(int i) {
//		// TODO Auto-generated method stub
//		ArrayList<Dept> list = dao.selectDeptno(i);
//		return list;
//	}
	
	public Dept selectDeptno(int i) throws Exception {
		Dept d = dao.selectDeptno(i);
		return d;
	}
	
	
	
}

package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OracleMyBatisDAO;
import com.dto.Dept;

public class OracleMyBatisService {

	OracleMyBatisDAO dao = new OracleMyBatisDAO();
	
	public OracleMyBatisService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Dept> selectAll() {
		// TODO Auto-generated method stub
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<Dept> list = null;
		try {
			list = dao.selectAll(session);
		} finally {
			// TODO: handle finally clause
			session.close();
		}
		return list;
	}
	
	public int insert(Dept dept) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int num = 0;
		try {
			num = dao.insert(session, dept);
			session.commit();
		} finally {
			session.close();
		}
		return num;
	}

}

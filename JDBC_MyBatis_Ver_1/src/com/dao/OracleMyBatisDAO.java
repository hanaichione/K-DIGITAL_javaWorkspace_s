package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public List<Dept> selectAll(SqlSession session) {
		// TODO Auto-generated method stub
		List<Dept> list = session.selectList("selectAll");
		return list;
	}

	public Dept selectByDeptno(SqlSession session) {
		// TODO Auto-generated method stub
		Dept d = session.selectOne("selectByDeptno");
		return d;
	}

}	// end class

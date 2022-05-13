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

	public int insert(SqlSession session, Dept dept) {
		int num = session.insert("deptInsert", dept);
		System.out.println("추가된 레코드 ==== " + num);
		return num;
	}

}

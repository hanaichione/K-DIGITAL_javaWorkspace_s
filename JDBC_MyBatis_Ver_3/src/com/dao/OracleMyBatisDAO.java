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

	public void update(SqlSession session, Dept dept) {
		// TODO Auto-generated method stub
		int num = session.update("deptUpdate", dept);
		System.out.println("업데이트 갯수 : " + num);
	}

	public void delete(SqlSession session, int i) {
		// TODO Auto-generated method stub
		int num = session.delete("deptDelete", i);
		System.out.println("삭제된 갯수 : " + num);
	}

}

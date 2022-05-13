package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.Dept;

public class OracleMyBatisDAO {

	public OracleMyBatisDAO() {
	}

	public List<Dept> selectAll(SqlSession session) {
		// <select id="selectAll" resultType="com.dto.dept">
		// session.selectList, selectOne, delete, update, insert, commit, rollback
		// select 함수 두가지 : selectList(mapper.id), selectOne(하나)
		List<Dept> list = session.selectList("selectAll"); // mapper id
		return list;
	}

}	// end class

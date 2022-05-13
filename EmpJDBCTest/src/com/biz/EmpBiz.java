package com.biz;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Map;

import com.common.util.JdbcTemplate;
import com.dao.EmpDAO;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

import oracle.sql.converter.JdbcCharacterConverters;

public class EmpBiz {
	EmpDAO dao;

	public EmpBiz() {
		super();
		// TODO Auto-generated constructor stub
		dao = new EmpDAO();	// 실수 많이 나옴
		JdbcTemplate template = new JdbcTemplate();	// 드라이버 로딩
	}
	
	public ArrayList<EmpDTO> selectAllEmp() {
		Connection con = JdbcTemplate.getConnection();
		ArrayList<EmpDTO> list = dao.selectAllEmp(con);
		JdbcTemplate.close(con);
		return list;
	}
	
	public void empInsert(EmpDTO empDTO) {
		Connection con = JdbcTemplate.getConnection();
		dao.insert(con, empDTO);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}

	// 사원번호로 사원 조회하기
//	public EmpDTO selectDetailEmp(String str) throws DataNotFoundException {
//		// TODO Auto-generated method stub
//		Connection con = JdbcTemplate.getConnection();
//		EmpDTO empDTO = dao.selectDetailEmp(con, str);
//		JdbcTemplate.close(con);
//		return empDTO;
//	}

	public void empUpdate(EmpDTO empDTO) throws DataNotFoundException {
		Connection con = JdbcTemplate.getConnection();
		dao.update(con, empDTO);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}

	public void empDelete(String str) throws DataNotFoundException {
		// TODO Auto-generated method stub
		Connection con = JdbcTemplate.getConnection();
		dao.delete(con, str);
		JdbcTemplate.commit(con);
		JdbcTemplate.close(con);
	}

	public ArrayList<EmpDTO> selectDetailEmp2(Map map) {
		Connection con = JdbcTemplate.getConnection();
		ArrayList<EmpDTO> list = dao.selectDetailEmp2(con, map);
		JdbcTemplate.close(con);
		return list;
	}
	
}

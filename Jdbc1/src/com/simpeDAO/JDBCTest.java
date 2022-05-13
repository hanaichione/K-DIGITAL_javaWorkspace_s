package com.simpeDAO;

import java.util.ArrayList;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeptDAO dao = new DeptDAO();
		dao.insertDept(new DeptDTO(99,  "서울", "부산"));
		ArrayList<DeptDTO> list = dao.selectAllDept();
		for (DeptDTO d : list) {
			System.out.println("main 출력 >> " + d);
		}
		
	}

}

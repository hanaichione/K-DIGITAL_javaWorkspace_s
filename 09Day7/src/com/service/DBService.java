package com.service;

import com.dao.MySQLDAO;
import com.dao.OracleDAO;

public class DBService {
//	public void setDAO(MySQLDAO dao) {
//		dao.connectMYSQL();
	
		public void setDAO(OracleDAO dao) {
			dao.connectOracle();
	}
}

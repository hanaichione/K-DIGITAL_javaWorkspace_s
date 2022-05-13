package com.dao;

import java.util.HashSet;

public class OracleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleService service = new OracleService();
		HashSet<String> xxx = service.select();
		for (String s : xxx) {
			System.out.println(s);
		}
	}

}

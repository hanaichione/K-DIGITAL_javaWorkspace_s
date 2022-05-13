package workshop08.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCTest5 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String pass = "test";
		
		FactoryBiz biz = new FactoryBiz(driver, url, user, pass);
		
		ArrayList<FactoryDTO> list = biz.getFactoryAll();
		
		System.out.println("공장번호 \t\t공장명 \t\t공장위치");
		for (FactoryDTO dto : list) {
			System.out.println(dto.getFactNo() + "\t" + dto.getFacName() + "\t" + dto.getFacLoc());
		}
	}

}

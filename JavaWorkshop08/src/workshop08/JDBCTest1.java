package workshop08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest1 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String pass = "test";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try
		{
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);

			String query = "SELECT PDNAME, PDSUBNAME, FACNAME, STONAME, STAMOUNT " + "FROM PRODUCT "
					+ "JOIN FACTORY USING (FACTNO) " + "JOIN STORE USING (PDNO) "
					+ "WHERE FACLOC = 'SEOUL' AND (STAMOUNT IS NULL OR STAMOUNT = 0)";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();

			System.out.println("제품카테고리 \t제품명 \t공장명 \t판매점명 \t판매점재고수량");
			System.out.println("------------------------------------------------------");
			while (rs.next()) {
				String pdName = rs.getString("PDNAME");
				String pdSubName = rs.getString("PDSUBNAME");
				String facName = rs.getString("FACNAME");
				String StoName = rs.getString("STONAME");
				int stAmount = rs.getInt("STAMOUNT");
				System.out.println(pdName + "\t" + pdSubName + "\t" + facName + "\t" + StoName + "\t" + stAmount);
			}
		}catch(
		ClassNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(
		SQLException e2)
		{
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}finally
		{
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	


} // end class

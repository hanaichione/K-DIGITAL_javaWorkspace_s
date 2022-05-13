package workshop08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest2 {
	
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
	    String user = "test";
	    String pass = "test";
	    
	    Connection con = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
	    
	    try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			
			String sql = "select pdsubname, pdcost, pdprice " + "from product " +
			"where pdcost > any (select pdcost from product where pdname = 'TV') "+
			"and pdcost < any (select pdcost from product where pdname = 'CELLPHONE') " +
			"order by 2";
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			System.out.println("제품명 \t\t 제품원가 \t\t 제품가격");
			System.out.println("-----------------------------------------------------------");
			
			while (rs.next()) {
				String pdSubName = rs.getString("PDSUBNAME");
				int pdCost = rs.getInt("PDCOST");
				int pdPrice = rs.getInt("PDPRICE");
				
				System.out.println(pdSubName + "\t" + pdCost + "\t" + pdPrice);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

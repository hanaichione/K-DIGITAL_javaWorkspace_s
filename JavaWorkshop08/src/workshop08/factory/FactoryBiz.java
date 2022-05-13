package workshop08.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class FactoryBiz {
	
	private String driver;
	private String url;
	private String user;
	private String pass;
	
	FactoryDAO dao = new FactoryDAO();

	public FactoryBiz(String driver, String url, String user, String pass) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pass = pass;
	}

	public FactoryBiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<FactoryDTO> getFactoryAll(){
		Connection con = null;
		ArrayList<FactoryDTO> list = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);
			list = dao.getFactoryAll(con);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return list;
	}
}

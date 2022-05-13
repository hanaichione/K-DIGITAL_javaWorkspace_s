import com.dao.MySQLDAO;
import com.dao.OracleDAO;
import com.service.DBService;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		OracleDAO dao = new OracleDAO();
//		dao.connectOracle();
		
//		MySQLDAO dao = new MySQLDAO();
//		dao.connectMYSQL();
		
//		DBService service = new DBService();
//		service.setDAO(new MySQLDAO());
		
		DBService service = new DBService();
		service.setDAO(new OracleDAO());
		
		
	}

}

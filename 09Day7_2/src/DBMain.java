import com.dao.MySQLDAO;
import com.dao.OracleDAO;
import com.service.DBService;

// interface 사용법 : 디커플링, 클래스간의 연관성을 줄여 유지보수 용이하게 하기

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		OracleDAO dao = new OracleDAO();
//		dao.connectOracle();
		
//		MySQLDAO dao = new MySQLDAO();
//		dao.connectMYSQL();
		
		DBService service = new DBService();
		service.setDAO(new MySQLDAO());
		service.setDAO(new OracleDAO());
		
		
	}

}

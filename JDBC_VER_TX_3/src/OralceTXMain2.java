import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTXService;

public class OralceTXMain2 {

	public static void main(String[] args) {

		OracleTXService service = new OracleTXService();
		
		service.insertDelete(new Dept(99, "개발", "제주"), 88);
		
		
		// select
		try {
//			System.out.println(service.select());
			ArrayList<Dept> list = service.select();
			for (Dept d : list) {
				System.out.println(d);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.getStackTrace();
		}

	} // end main
} // end class

import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleTXService;

public class OralceTXMain {

	public static void main(String[] args) {

		OracleTXService service = new OracleTXService();

		// insert
		Dept xx = new Dept(99, "영업", "서울");
		int num = service.insert(xx);
		System.out.println("in main insert num = " + num);

		// update
		Dept xx2 = new Dept(99, "제경", "부산");
		try {
			int num3 = service.update(xx2);
			System.out.println("in main updqte num = " + num3);
		} catch (RecordNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		// delete
		int num2 = service.delete(99);
		System.out.println("in main delete num = " + num2);

		System.out.println("================================");
		
		// select
		try {
//			System.out.println(service.select());
			ArrayList<Dept> list = service.select();
			for (Dept d : list) {
				System.out.println(d);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}



	} // end main
} // end class

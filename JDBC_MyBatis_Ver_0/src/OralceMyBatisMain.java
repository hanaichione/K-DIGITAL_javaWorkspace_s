import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();
		
		List<Dept> list = service.selectAll();
		System.out.println(list);
	}

}

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain5 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		
		HashMap<String, String> map = new HashMap<>();
//		map.put("loc", "NEW YORK");
//		map.put("dname", "RESEARCH");
		List<Dept> list = service.selectDynamicChoose(map);
		for (Dept dept : list) {
			System.out.println(dept);
		}

	}	// end main

}	// end class

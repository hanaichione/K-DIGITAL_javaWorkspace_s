import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain5 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		
		List<Dept> depts = Arrays.asList(new Dept(12, " ", " "), new Dept(13, " ", " "));
		service.multiDelete(depts);
		List<Dept> list = service.selectAll();
		
		for (Dept dept : list) {
			System.out.println(dept);
		}

	}	// end main

}	// end class

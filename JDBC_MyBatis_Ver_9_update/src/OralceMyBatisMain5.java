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
		
		List<Integer> deptnoes=Arrays.asList(12, 13, 50);
		List<Dept> list = service.multiSelect(deptnoes);
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		System.out.println("==================");
		List<Integer> deptnoes2=Arrays.asList(12, 13, 50);
		service.multiUpdate(deptnoes2);
		
		// update 후
		for (Dept dept : list) {
			System.out.println(dept);
		}

	}	// end main

}	// end class

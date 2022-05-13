import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain6 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
		
		// n페이지부터 m개의 페이지 불러오기
//		List<Dept> deptList3 = service.selectTopN(0,2);
//		for (Dept dept : deptList3) {
//			System.out.println(">>>" + dept);
//		}
		
		List<Dept> depts = Arrays.asList(new Dept(12, " ", " "), new Dept(13, " ", " "));
		service.multiInsert(depts);
		List<Dept> list = service.selectAll();
		
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		

	}	// end main
}	// end class

import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OracleMyBatisService service = new OracleMyBatisService();
		
		List<Dept> list = service.selectAll();
		// select * from dept where deptno >= 40;
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
		System.out.println("==========================");
		
		List<Dept> list2 = service.selectAll2();
		// select * from dept where deptno >= 40;
		for (Dept dept : list) {
			System.out.println(dept);
		}
		
//		Dept d = service.selectByDeptno();
//		System.out.println(d);
	}	// end main

}	// end class

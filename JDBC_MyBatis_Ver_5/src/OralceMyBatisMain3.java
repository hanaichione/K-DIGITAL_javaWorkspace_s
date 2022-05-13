import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain3 {

	public static void main(String[] args) {
		OracleMyBatisService service= new OracleMyBatisService();
//		int num= service.deptRecordCount();//전체 레코드 갯수 구하기 
//		
//		System.out.println("레코드 갯수는 num==="+ num);
		
		HashMap map = service.selectByDeptHashmap(10);
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		for (String key : keys) {
			System.out.print(key + ":");
			System.out.print(map.get(key));
			System.out.println();
		}
		
		System.out.println("===============");
		String loc = (String)map.get("LOC");
		System.out.println(loc);
		
		BigDecimal big = (BigDecimal)map.get("DEPTNO");
		int no = big.intValue();
		System.out.println(no+10);
		
		List<Dept> list= service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

}

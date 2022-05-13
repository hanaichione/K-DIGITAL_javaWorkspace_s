import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleMyBatisService service = new OracleMyBatisService();
		
		int num = service.insert(new Dept(99, "개발", "강남")); // 반드시 commit 해줘야 함
		System.out.println("in main insert 갯수 : " + num);
		
		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

}

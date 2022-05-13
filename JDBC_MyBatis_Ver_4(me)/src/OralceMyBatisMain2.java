import java.util.List;

import com.dto.Dept;
import com.service.OracleMyBatisService;

public class OralceMyBatisMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleMyBatisService service = new OracleMyBatisService();
		
		// insert
//		int num = service.insert(new Dept(99, "개발", "강남")); // 반드시 commit 해줘야 함
//		System.out.println("in main insert 갯수 : " + num);
		
		// update
//		service.update(new Dept(99, "영업", "서울"));
		
		// delete
//		service.delete(99);
		
		Dept d = service.selectByDeptno(10);
		System.out.println(d);
		
		System.out.println("==============================");
		
		List<Dept> list = service.selectAll();
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}

}

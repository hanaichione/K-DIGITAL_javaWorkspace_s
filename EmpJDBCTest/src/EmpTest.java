import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.biz.EmpBiz;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpTest {

	public static void main(String[] args) throws DataNotFoundException {
		// TODO Auto-generated method stub
		
		EmpBiz empBiz = new EmpBiz();
		
		// insert
//		empBiz.empInsert(new EmpDTO(30, "kim", "sales", 7902, null, 0.0, 0.1, 10));

		// update
//		empBiz.empUpdate(new EmpDTO(30, "kim", "AAAAA", 7902, null, 1.0, 0.1, 10));
		System.out.println("=========================================================");
		
		// delete
//		empBiz.empDelete("30");
		
		// 사원번호가 7369번인 사원 조회하기
//		EmpDTO dto = empBiz.selectDetailEmp("7369");
//		System.out.println(dto);
//		System.out.println("=========================================================");
		
		// 조건을 두 개, map으로 줘서 사원 조회하기 ********
		Map map = new HashMap<>();
		map.put("job", "SALESMAN");
		map.put("deptno", "30");
		ArrayList<EmpDTO> list= empBiz.selectDetailEmp2(map);
		System.out.println("=========================================================");
		
//		Set<String> keys = map.keySet();
//		for (String key : keys) {
//			System.out.println(list);
//		}
		
		
		
//		ArrayList<EmpDTO> list = empBiz.selectAllEmp();
//		System.out.println(list);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		// 출력
		for (EmpDTO e : list) {
			System.out.println(e);
		}
	}

}

import java.sql.SQLException;
import java.util.ArrayList;

import com.dto.Dept;
import com.exception.RecordNotFoundException;
import com.service.OracleService;

public class OralceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleService service = new OracleService();

		// insert
		Dept xx = new Dept(99, "영업", "서울");
		int num = service.insert(xx);
		System.out.println("in main num = " + num);

		// update
		Dept xx2 = new Dept(79, "제경", "부산");
		try {
			int num3 = service.update(xx2);
			System.out.println("in main updqte num = " + num3);
		} catch (RecordNotFoundException e1) {
			// TODO: handle exception
			System.out.println(e1.getMessage());
			e1.printStackTrace();
		}

		// delete
		int num2 = service.delete(99);
		System.out.println("in main 삭제 갯수 : " + num2);

		// select
		try {
//			System.out.println(service.select());
			ArrayList<Dept> list = service.select();
			for (Dept d : list) {
				System.out.println(d);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// 과제
		System.out.println("========================================");
		System.out.println("========부서번호가 40번인 부서 정보 출력하기========");
//		ArrayList<Dept> list2 = service.selectDeptno(40);
//		System.out.println(list2);
		
		try {
			Dept dept = service.selectDeptno(40);
			System.out.println(dept);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}


	} // end main
} // end class

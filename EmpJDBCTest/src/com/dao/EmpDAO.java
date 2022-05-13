package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import com.common.util.JdbcTemplate;
import com.entity.EmpDTO;
import com.exception.DataNotFoundException;

public class EmpDAO {

	public ArrayList<EmpDTO> selectAllEmp(Connection con) {
		// TODO Auto-generated method stub
		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select empno, ename, job, mgr, to_char(hiredate, 'YYYY-MM-DD') hiredate, sal, comm, deptno from emp "
					+ "order by empno desc";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");
				EmpDTO dto = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return list;
	}

	public void insert(Connection con, EmpDTO empDTO) {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		try {
			String sql = "insert into emp values (?, ?, ?, ?, sysdate, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empDTO.getEmpno());
			pstmt.setString(2, empDTO.getEname());
			pstmt.setString(3, empDTO.getJob());
			pstmt.setInt(4, empDTO.getMgr());
			pstmt.setDouble(5, empDTO.getSal());
			pstmt.setDouble(6, empDTO.getComm());
			pstmt.setInt(7, empDTO.getDeptno());
			int n = pstmt.executeUpdate();
			System.out.println("insert 된 갯수 : " + n);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
	}

//	public EmpDTO selectDetailEmp(Connection con, String str) throws DataNotFoundException {
//		// TODO Auto-generated method stub
////		int empno = Integer.parseInt(str);
//		EmpDTO empDTO = new EmpDTO();
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			String sql = "select empno, ename, job, mgr, to_char(hiredate, 'YYYY-MM-DD') hiredate, sal, comm, deptno from emp where empno = ?"
//					+ "order by empno desc";
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, Integer.parseInt(str));
//			rs = pstmt.executeQuery();
//			if (rs.next()) {
//				int empno = rs.getInt("empno");
//				String ename = rs.getString("ename");
//				String job = rs.getString("job");
//				int mgr = rs.getInt("mgr");
//				String hiredate = rs.getString("hiredate");
//				double sal = rs.getDouble("sal");
//				double comm = rs.getDouble("comm");
//				int deptno = rs.getInt("deptno");
//				empDTO = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
//			} else {
//				throw new DataNotFoundException(str + "에 해당하는 사원정보가 없습니다. 확인 후 다시 조회하세요.");
//			}
//		} catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			JdbcTemplate.close(rs);
//			JdbcTemplate.close(pstmt);
//		}
//		return empDTO;
//	}

	public void update(Connection con, EmpDTO empDTO) throws DataNotFoundException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
		try {
			String sql = "update emp set job = ?, sal = ? where empno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, empDTO.getJob());
			pstmt.setDouble(2, empDTO.getSal());
			pstmt.setInt(3, empDTO.getEmpno());
			int n = pstmt.executeUpdate();
			System.out.println("update 된 갯수 : " + n);
			if(n==0) throw new DataNotFoundException(empDTO.getEmpno()+"에 해당하는 사원 정보가 없습니다. 확인 후 다시 조회하세요.");
//			if (n != 0) {				
//				System.out.println("update 된 갯수 : " + n);
//			} else {
//				throw new DataNotFoundException(empDTO.getEmpno()+"에 해당하는 사원 정보가 없습니다. 확인 후 다시 조회하세요.");
//			}

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new DataNotFoundException(empDTO.getEmpno()+"를 업데이트 하지 못했습니다. 확인 후 다시 조회하세요.");
		} finally {
			JdbcTemplate.close(pstmt);
		}
	}

	public void delete(Connection con, String str) throws DataNotFoundException {
		// TODO Auto-generated method stub
		EmpDTO empDTO = new EmpDTO();
		PreparedStatement pstmt = null;
		try {
			String sql = "delete emp where empno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(str));
			int n = pstmt.executeUpdate();
			System.out.println("delete 된 갯수 : " + n);
			if(n == 0) throw new DataNotFoundException(str+"번에 해당하는 사원이 없습니다.");
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new DataNotFoundException(str+"번 사원을 삭제하지 못했습니다.");
		}
	}

	public ArrayList<EmpDTO> selectDetailEmp2(Connection con, Map<String, String> map) {
		String job = map.get("job");
		String no = map.get("deptno");
		System.out.println("in dao = " + job + "\t" + no);

		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			String sql = "select empno, ename, job, mgr, to_char(hiredate, 'YYYY-MM-DD') hiredate, sal, comm, deptno "
					+ "from emp where job = ? and deptno = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, job);
			pstmt.setInt(2, Integer.parseInt(no));
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				String hiredate = rs.getString("hiredate");
				double sal = rs.getDouble("sal");
				double comm = rs.getDouble("comm");
				int deptno = rs.getInt("deptno");
				EmpDTO dto = new EmpDTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
		return list;
	}

}

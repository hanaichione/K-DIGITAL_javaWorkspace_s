package com.simpeDAO;

public class DeptDTO {	// db 레코드 하나를 저장할 모델 클래스
	
	// 모델 클래스의 멤버변수 == 컬럼명
	int deptno;
	String dname;
	String loc;
	
	public DeptDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeptDTO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	public int getDeptno() {
		return deptno;
	}
	public String getDname() {
		return dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	@Override
	public String toString() {
		return "DeptDTO [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}

}

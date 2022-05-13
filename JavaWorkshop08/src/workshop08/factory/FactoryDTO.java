package workshop08.factory;

public class FactoryDTO {
	private String factNo;
	private String facName;
	private String facLoc;
	
	public FactoryDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FactoryDTO(String factNo, String facName, String facLoc) {
		super();
		this.factNo = factNo;
		this.facName = facName;
		this.facLoc = facLoc;
	}
	public String getFactNo() {
		return factNo;
	}
	public String getFacName() {
		return facName;
	}
	public String getFacLoc() {
		return facLoc;
	}
	public void setFactNo(String factNo) {
		this.factNo = factNo;
	}
	public void setFacName(String facName) {
		this.facName = facName;
	}
	public void setFacLoc(String facLoc) {
		this.facLoc = facLoc;
	}
	
	@Override
	public String toString() {
		return "FactoryDTO [factNo=" + factNo + ", facName=" + facName + ", facLoc=" + facLoc + "]";
	}
	
}

package mobile;

public abstract class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
	
	public Mobile(String mobileName, int batterySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public abstract int operate(int time);	// 사용
	public abstract int charge(int time);	// 충전

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	public String print() {
		return mobileName + "    " + batterySize + "    " + osType;
	}
}

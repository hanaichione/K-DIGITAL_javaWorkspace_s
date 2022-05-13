package shape;

public abstract class Shape {
	
	private int width;
	private int height;
	private String colors;
	
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shape(int width, int height, String colors) {
		super();
		this.width = width;
		this.height = height;
		this.colors = colors;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public String getColors() {
		return colors;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	
	public abstract double getArea();
}

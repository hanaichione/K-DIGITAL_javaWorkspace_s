package shape;

public class Triangle extends Shape implements Resize {

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height, String colors) {
		super(width, height, colors);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setResize(int size) {
		// TODO Auto-generated method stub
		setHeight(getHeight()+size);
	}

	@Override
	public double getArea() {
		return getHeight()*getWidth()*1/2;
	}
	
	
}

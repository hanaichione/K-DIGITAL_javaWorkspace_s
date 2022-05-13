package workshop07.shape;

public abstract class Shape {
	
	protected Point point;

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape(Point point) {
		super();
		this.point = point;
	}
	
	public abstract double getArea();
	
	public abstract double getCircumference();

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
}

package workshop07.shape;

public class Rectangle extends Shape implements Movable {
	private int width;

	@Override
	public void move(int x, int y) {
		point.setX(point.getX()+x+2);
		point.setY(point.getY()+y+2);
	}

	@Override
	public double getArea() {
		double result = 0.0;
		result = width*width;
		return Math.round(result);
	}

	@Override
	public double getCircumference() {
		double result = 0.0;
		result = (2*width) + (2*width);
		return Math.round(result);
	}

	public Rectangle(int width, int x, int y) {
		super(new Point(x,y));
		this.width = width;
	}

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(Point point) {
		super(point);
		// TODO Auto-generated constructor stub
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}

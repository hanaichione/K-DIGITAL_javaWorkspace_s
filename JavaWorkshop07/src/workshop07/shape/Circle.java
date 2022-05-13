package workshop07.shape;

public class Circle extends Shape implements Movable {
	
	private int radius;

	@Override
	public double getArea() {
		double result = 0.0;
		result = radius*radius*Math.PI;
		return Math.round(result);
	}

	@Override
	public double getCircumference() {
		double result = 0.0;
		result = 2*radius*Math.PI;
		return Math.round(result);
	}

	public Circle(int radius, int x, int y) {
		super(new Point(x,y));
		this.radius = radius;
	}

	public void move(int x, int y) {
		point.setX(point.getX()+x+1);
		point.setY(point.getY()+x+1);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
}

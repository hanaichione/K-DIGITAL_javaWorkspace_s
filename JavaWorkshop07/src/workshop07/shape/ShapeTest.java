package workshop07.shape;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Shape> list = new ArrayList<>();
		
		Circle c = new Circle(6, 6, 7);
		Circle c2 = new Circle(7, 8, 3);
		Rectangle r = new Rectangle(4, 7, 5);
		Rectangle r2 = new Rectangle(5, 4, 6);
		
		list.add(r);
		list.add(r2);
		list.add(c);
		list.add(c2);
		
		System.out.println("구분\t\t 길이\t x좌표\t y좌표\t Area\t Circumference");
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof Rectangle) {
				Rectangle rac = (Rectangle)list.get(i);
				System.out.println("Rectangle\t" + rac.getWidth() + "\t" + rac.getPoint().getX() + "\t" + rac.getPoint().getY() + "\t" + rac.getArea() + "\t" + rac.getCircumference());
			}
			if(list.get(i) instanceof Circle) {
				Circle cir = (Circle)list.get(i);
				System.out.println("Circle\t\t" + cir.getRadius() + "\t" + cir.getPoint().getX() + "\t" + cir.getPoint().getY() + "\t" + cir.getArea() + "\t" + cir.getCircumference());
			}
		}
		
		System.out.println("이동 후...");
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) instanceof Rectangle) {
				Rectangle rac = (Rectangle)list.get(i);
				rac.move(10, 10);
				System.out.println("Rectangle\t" + rac.getWidth() + "\t" + rac.getPoint().getX() + "\t" + rac.getPoint().getY() + "\t" + rac.getArea() + "\t" + rac.getCircumference());
			}
			if(list.get(i) instanceof Circle) {
				Circle cir = (Circle)list.get(i);
				cir.move(10, 10);
				System.out.println("Circle\t\t" + cir.getRadius() + "\t" + cir.getPoint().getX() + "\t" + cir.getPoint().getY() + "\t" + cir.getArea() + "\t" + cir.getCircumference());
			}
		}
	}

}

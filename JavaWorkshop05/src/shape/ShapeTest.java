package shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape shape[] = { new Triangle(7, 5, "Blue"), new Rectangle(4, 6, "Blue"), new Triangle(6, 7, "Blue"),
				new Rectangle(8, 3, "Red"), new Triangle(9, 8, "White"), new Rectangle(5, 7, "White") };

		for (Shape s : shape) {
			if (s instanceof Triangle) {
				System.out.print("Triangle \t");
			} else {
				System.out.print("Rectangle \t");
			}
			System.out.println(s.getArea() + "\t" + s.getColors());
		}

		for (Shape s : shape) {
			Resize size = (Resize) s;
			size.setResize(5);
		}
		System.out.println();
		System.out.println("사이즈를 변경 후 정보");
		for (Shape s : shape) {
			if (s instanceof Triangle) {
				System.out.print("Triangle \t");
			} else {
				System.out.print("Rectangle \t");
			}
			System.out.println(s.getArea() + "\t" + s.getColors());
		}

	}

}

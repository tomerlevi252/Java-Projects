
public class Program {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3, 4, 5, 2);
		Rectangle r2 = new Rectangle(5, 6, 7, 1);
		
		int result = r1.getArea();
		System.out.println(result);
		
		r1.moveTo(3, 1, 1, 5);
		System.out.println(r1.getPerimiter());
		System.out.println(r2.getPerimiter());
		
		System.out.println(r1.isSquare());
		System.out.println(r2.isSquare());

	}

}

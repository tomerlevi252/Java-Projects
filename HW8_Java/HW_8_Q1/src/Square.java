

public class Square extends Polygons {
	private double x;

	public Square(double x) {
		this.x=x;
	}
	
	@Override
	public double getArea() {
		return x*x;
	}

	@Override
	public double getPerimeter() {
		return 4*x;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Name: Square");
		System.out.println(this.x);
	}
	
	@Override
	public String whoAmI() {
		super.whoAmI();
		return "Square";
	}
}

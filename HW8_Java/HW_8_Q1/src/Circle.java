

public class Circle extends Ellipticals{
	private double r;
	
	public Circle(double r) {
		this.r=r;
	}

	@Override
	public double getArea() {
		return Math.PI*r*r;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*r;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Name: Circle");
		System.out.println(this.r);
	}
	
	@Override
	public String whoAmI() {
		super.whoAmI();
		return "Circle";
	}

}

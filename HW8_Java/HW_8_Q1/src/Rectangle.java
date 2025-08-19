

public class Rectangle extends Polygons{
	private double h,w;
	
	public Rectangle(double h,double w) {
		this.h=h;
		this.w=w;
	}

	@Override
	public double getArea() {
		return h*w;
	}

	@Override
	public double getPerimeter() {
		return 2*h+2*w;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Name: Rectangle");
		System.out.println(this.h);
		System.out.println(this.w);
	}
	
	@Override
	public String whoAmI() {
		super.whoAmI();
		return "Rectangle";
	}

}



public class Triangle extends Polygons{
	private double base,height;
	
	public Triangle(double base, double height) {
		this.base=base;
		this.height=height;
	}

	@Override
	public double getArea() {
		return (base*height)/2;
	}

	@Override
	public double getPerimeter() {
		return base+height+Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Name: Triangle");
		System.out.println(this.base);
		System.out.println(this.height);
	}
	
	@Override
	public String whoAmI() {
		super.whoAmI();
		return "Triangle";
	}

}

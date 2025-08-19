

public class Ellipse extends Ellipticals{
	private double width,height;
	
	public Ellipse(double width,double height) {
		this.width=width;
		this.height=height;
	}

	@Override
	public double getArea() {
		return Math.PI*width*height;
	}

	@Override
	public double getPerimeter() {
		return  2*Math.PI*(0.5*width+0.5*height);
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Name: Ellipse");
		System.out.println(this.width);
		System.out.println(this.height);
	}
	
	@Override
	public String whoAmI() {
		super.whoAmI();
		return "Ellipse";
	}

}

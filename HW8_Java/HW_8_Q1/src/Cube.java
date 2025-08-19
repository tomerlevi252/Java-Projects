

public class Cube extends ThreeDimension{
	private double x;
	
	public Cube(double x) {
		this.x=x;
	}

	@Override
	public double getArea() {
		return 6*Math.pow(x,2);
	}

	@Override
	public double getVolume() {
		return Math.pow(x,3);
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Name: Cube");
		System.out.println(this.x);
	}
	
	@Override
	public String whoAmI() {
		super.whoAmI();
		return "Cube";
	}

	
	

}

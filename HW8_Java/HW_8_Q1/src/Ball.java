

public class Ball extends ThreeDimension{
	private double r;
	
	public Ball(double r) {
		this.r=r;
	}

	@Override
	public double getArea() {
		return 4*Math.PI*Math.pow(r,2);
	}

	@Override
	public double getVolume() {
		return (4.0/3.0)*Math.PI*Math.pow(r,3);
	}

	@Override
	public void show() {
		super.show();
		System.out.println("Name: Ball");
		System.out.println(this.r);
	}
	
	@Override
	public String whoAmI() {
		super.whoAmI();
		return "Ball";
	}
	

}

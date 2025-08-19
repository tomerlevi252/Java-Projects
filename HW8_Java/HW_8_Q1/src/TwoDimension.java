

public abstract class  TwoDimension extends Shape{
		
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	public  void show() {
		System.out.println("Type: Two Dimension");
	}

	@Override
	public String whoAmI() {
		return "2D";
	}
	
	@Override
	public boolean equals(Shape s) {
		if(s instanceof TwoDimension) {
			TwoDimension temp=(TwoDimension)s;
			if(temp.getArea()==this.getArea() && temp.getPerimeter()==this.getPerimeter())
				return true;
		}
		return false;
	}
	
	

}



public abstract class ThreeDimension extends Shape{
	
	public abstract double getArea();
	
	public abstract double getVolume();
	
	public void show() {
		System.out.println("Type: Three Dimension");
	}
	
	@Override
	public String whoAmI() {
		return "3D";
	}
	
	@Override
	public boolean equals(Shape s) {
		if(s instanceof ThreeDimension) {
			ThreeDimension temp=(ThreeDimension)s;
			if(temp.getArea()==this.getArea() && temp.getVolume()==this.getVolume())
				return true;
		}
		return false;
	}
	
	

}



public abstract class Shape {
	
	public abstract void show();
	
	public abstract double getArea();
	
	public int compare(Shape s) {
		if(this.getArea()>s.getArea())return 1;
		else if(this.getArea()<s.getArea())return -1;
		return 0;
	}
		
	public abstract String whoAmI();
	
	public abstract boolean equals(Shape s);

	

}

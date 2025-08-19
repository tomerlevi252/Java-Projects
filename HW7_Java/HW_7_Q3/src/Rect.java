

public class Rect{
	public int height;//גובה
	public int width;//רוחב
	
	public Rect(int height,int width) {
		this.height=height;
		this.width=width;
	}
	
	public int getArea() {
		return this.height*this.width;
	}
	
	public int getPerimeter() {
		return this.height*2+this.width*2;
	}

}

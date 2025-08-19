

public class Rectangle {
	private int xu,yu;
	private int xl,yl;
	
	public Rectangle() {
		xu=0;
		yu=0;
		xl=1;
		yl=-1;
	}
	
	public Rectangle(int a,int b,int c,int d) {
		xu=a;
		yu=b;
		xl=c;
		yl=d;
	}
	
	public int getPerimiter() {
		int width=xl-xu; //רוחב
		int height=yu-yl; // גובה 
		int perimiter=2*width+2*height;
		return perimiter;
	}
	
	public int getArea() {
		int width=xl-xu;
		int height=yu-yl;
		int area=height*width;
		return area;
	}
	
	public void show() {
		System.out.println("xu="+xu+",yu="+yu+",xl="+xl+",yl="+yl);
	}
	
	public void moveTo(int ux,int uy, int lx,int ly) {
		ux=xu;
		uy=yu;
		lx=xl;
		ly=yl;
	}
	
	public boolean isInside(int x, int y) {
		if((x>=xu && x<=xl) && (y>=yl && y<=yu)) {
			return true;
		}
		else return false;	
	}

	public double getDiagonalLength() {
		int width=xl-xu;
		int height=yu-yl;
		return Math.sqrt(((width*width)+(height*height)));		
	}
	
	public boolean isSquare() {
		int width=xl-xu;
		int height=yu-yl;
		if(width==height) return true;
		else return false;
	}
	
	public boolean isGolden() {
		int width=xl-xu;
		int height=yu-yl;
		if(width==height*1.618) return true;
		else return false;
	}
	
	
	
	
}

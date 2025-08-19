

public class Line {
	private double x1,y1;
	private double x2,y2;
	
	public Line() {
		x1=0;
		y1=1;
		x2=4;
		y2=3;
	}
	
	public Line(double xx1, double yy1, double xx2, double yy2) {
		x1=xx1;
		y1=yy1;
		x2=xx2;
		y2=yy2;
	}
	
	public Line(double xxx1, double yyy1) {
		x1=xxx1;
		y1=yyy1;
		x2=0;
		y2=0;
	}
	
	public void show() {
		System.out.println("("+x1+","+y1+")"+"-"+"("+x2+","+y2+")");
	}

	public double getAngle() {
		double y=y2-y1;
		double x=x2-x1;
		double angle=y/x;
		return angle;
	}
	
	public boolean isOnLine(double x, double y) {
		double a = getAngle();	
		double b = y1;
		if(y==(a*x)+b) return true;
		else return false;
	}

}

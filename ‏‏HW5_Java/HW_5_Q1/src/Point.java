

public class Point {
	private float x,y;

	public Point(float x,float y) {
		this.x=x;
		this.y=y;
	}

	public Point(Point p) {
		this.x=p.x;
		this.y=p.y;
	}

	public void show() {
		System.out.println("("+x+","+y+")");
	}

	public Point middle(Point p) {
		float nx,ny;
		nx=(this.x+p.x)/2;
		ny=(this.y+p.y)/2;
		return new Point(nx,ny);
	}

	public float length(Point p) {
		float nx,ny;
		nx=(this.x-p.x);
		ny=(this.y-p.y);
		return (float)Math.sqrt(nx*nx+ny*ny);			
	}
	
	public boolean equals(Point p) {
		return this.x==p.x && this.y==p.y;
	}

}

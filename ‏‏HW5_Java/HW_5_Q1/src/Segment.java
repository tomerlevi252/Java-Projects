import java.util.Scanner;

public class Segment {
	private Point first,second;

	public Segment(){
		this.first=new Point(0,0);
		this.second=new Point(1,1);
	}

	public Segment(float x2,float y2) {
		this.first=new Point(0,0);
		this.second=new Point(x2,y2);	
	}

	public Segment(float x1,float y1,float x2,float y2) {
		this.first=new Point(x1,y1);
		this.second=new Point(x2,y2);	
	}

	public Segment(Point p1,Point p2) {
		this.first=new Point(p1);
		this.second=new Point(p2);

	}

	public Segment(float x1,float y1,Point p2) {
		this.first=new Point(x1,y1);
		this.second=new Point(p2);	
	}

	public Segment(Point p1,float x2,float y2) {
		this.first=new Point(p1);
		this.second=new Point(x2,y2);	
	}

	public Segment(Segment sg) {
		this.first=new Point(sg.first);
		this.second=new Point(sg.second);	

	}

	public void readSegment() {
		Scanner s=new Scanner(System.in);

		System.out.println("Enter first x,y: ");
		this.first=new Point(s.nextFloat(),s.nextFloat());
		
		System.out.println("Enter second x,y: ");
		this.second=new Point(s.nextFloat(),s.nextFloat());

		s.close();
	}

	public void show() {
		System.out.println();
		if(first!=null && second!=null) {
			System.out.print("First Point: ");
			first.show();
			System.out.print("Second Point: ");
			second.show();
			System.out.println();
		}
		else System.out.println("One of the Point is a null");
	}

	public Point middle() {
		return this.first.middle(this.second);	
	}

	public float length() {
		return this.first.length(this.second);	
	}

	public boolean greaterThan(Segment sg) {
		return this.length()>sg.length();	
	}

	public boolean lessThan(Segment sg) {
		return this.length()<sg.length();	
	}

	public boolean equals(Segment sg) {
		return this.first.equals(sg.first) && this.second.equals(sg.second);
	}

	public int compareTo(Segment sg) {
		System.out.println();
		if(this.length()==sg.length())return 0;
		else if(this.greaterThan(sg))return 1;
		else return -1;
	}
}

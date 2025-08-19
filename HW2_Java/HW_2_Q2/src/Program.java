
public class Program {

	public static void main(String[] args) {
		Line line=new Line();
		Line parallel = new Line(0, 2, 4, 4);
		Line perpendicular = new Line(2,0,4,-4);
		
		System.out.println(parallel.getAngle());
		
		double x;
		x=line.getAngle()*perpendicular.getAngle();
		System.out.println(x);



	}

}



public class Program {
	
	public static void main(String[]args) {
		Shape s1=new Circle(10);
		Shape s2=new Ball(6);
		Shape s3=new Triangle(3, 4);
		Shape s4=new Circle(2);
		DrawingBoard d1=new DrawingBoard(4);
		d1.add(s1);
		d1.add(s2);
		d1.add(s3);
		d1.add(s4);
		
		d1.showAll();
		Class[] c;
		c=d1.getTypes();

	}
		
			

	

}

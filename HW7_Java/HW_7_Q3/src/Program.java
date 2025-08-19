

public class Program {
	
	public static void main(String[] args) {
		Rect r = new Rect(2,5);
		System.out.println(r.getArea()); // המלבן שטח מודפס
		System.out.println(r.getPerimeter()); // המלבן היקף מודפס
		
		Square s = new Square(6);
		System.out.println(s.getArea()); // המלבן שטח מודפס
		System.out.println(s.getPerimeter());//המלבן היקף מודפס
	
	}
	
}

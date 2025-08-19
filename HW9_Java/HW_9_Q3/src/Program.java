

public class Program {

	public static void main(String[] args) {

		Set set1 = new Set(3,new Point(0,0),new Point(1,1),new Point(2,2));
		Set set2 = new Set(2,new Circle(2,3,3),new Point(4,4));

		Set set3=set1.add(set2);
		System.out.println(set3.toString());

		Set difference = set1.sub(set2);
		System.out.println("Difference: " + difference);

		Set intersection = set1.mul(set2);
		System.out.println("Intersection: " + intersection);

		// Iterating over set elements
		System.out.println("Iterating over Set 1:");
		while (set1.forward()) {
			System.out.println("Current element: " + set1.getCurrent());
		}

		// Resetting iterator
		set1.reset();

		// Another iteration over set elements
		System.out.println("Iterating over Set 1 again:");
		while (set1.forward()) {
			System.out.println("Current element: " + set1.getCurrent());
		}
	}
}

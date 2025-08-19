

public class Program {

	public static void main(String[] args) {
	    Showable[] showableArray = { new MyClass(),  new MyOtherClass()};
	    System.out.println("Showing all Showable objects:");
	    Utility.showAll(showableArray);

	    Object[] objectArray = {new MyClass(), new MyOtherClass(), "String"};
	    System.out.println("\nShowing all objects:");
	    Utility.showAll(objectArray);

	    Object[] searchArray = {1, 2, 3, 4, 5};
	    System.out.println("\nSearching for 3 in the array:");
	    System.out.println("Found: " + Utility.search(searchArray, 3)); 
	    
	    Integer[] maxArray = {5, 2, 8, 1, 9};
	    System.out.println("\nFinding the maximum value in the array:");
	    System.out.println("Max value: " + Utility.max(maxArray)); 
	}


}
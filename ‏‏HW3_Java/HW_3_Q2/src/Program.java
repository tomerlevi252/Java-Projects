import java.util.Scanner;

public class Program {


	public static void main(String[] args) {
		Calculator c1= new Calculator();

		Scanner s=new Scanner(System.in);
		System.out.println("Please enter some number: ");
		int n1=s.nextInt();
		
		System.out.println("The number you entered is: "+n1);
		
		if(c1.isSymmetric(n1))
			System.out.println("The number "+n1+"is symmetric");	
		else System.out.println("The number "+n1+"is not symmetric");
		
		int n2=Program.findNextSymmetric(n1);
		System.out.println("The first symmetric number after "+n1+" is: "+n2);
		s.close();
		
	  
	}
	
	public static int findNextSymmetric(int n) {
		Calculator c1= new Calculator();
		int nextN=n+1;
		while(!c1.isSymmetric(nextN)) {
			nextN++;
		}
		return nextN;
	}

}

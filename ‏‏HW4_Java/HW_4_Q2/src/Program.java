import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter new set maximal size: ");
		int maxSize=s.nextInt();

		Set array=new Set(maxSize);
		while(true) {
			System.out.print("Curret set is: ");
			array.show();
			System.out.println("Press 0 to exit program.");
			System.out.println("Press 1 to add new number to set.");
			System.out.println("Press 2 to remove existing number from set.");
			int n=s.nextInt();

			if(n==0)break;

			else if(n==1) {
				System.out.println("Enter new number to add to set:");
				int num=s.nextInt();
				if(array.add(num)) System.out.println("Adding "+num+" succeeded");
				else System.out.println("Adding "+num+" failed");	
			}

			else if(n==2) {
				System.out.println("Enter number to remove from set");
				int num=s.nextInt();
				if(array.remove(num))System.out.println("Removing "+num+" succeeded");
				else System.out.println("Removing "+num+" failed");	
			}	
		}



	}

}

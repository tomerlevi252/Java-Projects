import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		System.out.println("Please enter number of sides: ");
		int s=scan.nextInt();

		System.out.println("Please enter number of rolls in the experiment: ");
		int r=scan.nextInt();
		scan.close();

		int k=1;
		while(true) {
			System.out.println("Starting iteration # "+k);
			Die d=new Die(s);

			for(int i=0;i<r;i++) 
				d.rollDie(true);
			
			d.showStatistics();

			if(d.getAllMostFrequents().length>1)
				break;	

			k++;
			System.out.println();	
		}
		System.out.println("Found multiple max frequency. Experiment ended after "+k+" iterations");
	}

}

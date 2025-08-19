import java.util.Scanner;

public class Rectangle {
	private int height,width;
	
	public Rectangle(int h,int w) {
		this.height=h;
		this.width=w;
	}
	  
		public void drawFilled(char a) {
			for(int i=0;i<height;i++) {
				for(int j=0;j<width;j++) {
					System.out.print(a);
				}
				System.out.println();
			}
		}
		  public void drawEmpty(char a) {
			  for (int i=1;i<=height;i++) {
		           for (int j=1;j<=width;j++) {
		               if (((i==1) || (i==height)) || ((j==1) || (j==width))){
		                    System.out.print(a);
		                } else System.out.print(" ");
		                
		            }
		            System.out.println();
		        }
		  }
		  
		  public void readRectFromConsole() {
			  Scanner s=new Scanner(System.in);
			  
			  System.out.println("Please enter new width: ");
			  int w=s.nextInt();
			  width=w;	
			  
			  System.out.println("Please enter new height: ");
			  int h=s.nextInt();
			  height=h;
			  s.close();
			  
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	  
}

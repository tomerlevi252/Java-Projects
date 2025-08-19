

public class Program {

	public static void main(String[] args) throws CloneNotSupportedException {
		Matrix m1=new Matrix(3,3);
		
		
		m1.read();
		m1.write();
		System.out.println("-----");
		
		Matrix m2=m1.clone();
		m2.write();
		

	}

}

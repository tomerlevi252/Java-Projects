import java.util.*;

public class Matrix implements Arithmetic,InputOutput,Cloneable{
	int[][] data;
	private int row;
	private int column;

	public Matrix(int row,int column) {

		if(row<=0 || column<=0)
			throw new MatrixElementsLessOrEqualToZero("One or two of the elements are 0");

		this.row=row;
		this.column=column;
		data=new int[row][column];
	}

	@Override
	public Matrix add(Object o) {

		if(!(o instanceof Matrix))
			throw new NotMetrixException("o not a Metrix");

		Matrix temp=(Matrix)o;

		if(this.column != temp.column || this.row!=temp.row) 
			throw new NotEqualsMatrixException("The Metrixs are not the same length");

		Matrix result=new Matrix(this.row,this.column);

		for(int i=0;i<this.row;i++)
			for(int j=0;j<this.column;j++) 
				result.data[i][j]=this.data[i][j]+temp.data[i][j];		

		return result;
	}

	@Override
	public Matrix sub(Object o) {

		if(!(o instanceof Matrix))
			throw new NotMetrixException("o not a Metrix");

		Matrix temp=(Matrix)o;

		if(this.column != temp.column || this.row!=temp.row) 
			throw new NotEqualsMatrixException("The Metrixs are not the same length");

		Matrix result=new Matrix(this.row,this.column);

		for(int i=0;i<this.row;i++)
			for(int j=0;j<this.column;j++) 
				result.data[i][j]=this.data[i][j]-temp.data[i][j];		

		return result;
	}

	@Override
	public Matrix mul(Object o) {
		throw new multOperationNotSupported("cant use mul on metrix");
	}

	@Override
	public Matrix div(Object o) {
		throw new divOperationNotSupported("cant use div on metrix");

	}

	@Override
	public void read() {
		Scanner s=new Scanner(System.in);

		for(int i=0;i<this.data.length;i++) 
			for(int j=0;j<this.data[i].length;j++) {
				try 
				{
					System.out.println("Enter next input");
					this.data[i][j]=s.nextInt();
				}
				catch(InputMismatchException e) {
					System.out.println("You didnt put a INT!");
					s.next();
				}
			}
	}

	@Override
	public void write() {

		for(int i=0;i<this.data.length;i++) {
			System.out.print("(");
			for(int j=0;j<this.data[i].length;j++) {
				if(this.data.length-1!=j)
					System.out.print(this.data[i][j]+",");
				else 
					System.out.print(this.data[i][j]+")");
			}
			System.out.println();
		}
	}
	
	
	@Override
	public boolean equals(Object o) {

		if(!(o instanceof Matrix))
			throw new NotMetrixException("o not a Metrix");
		
		Matrix temp=(Matrix)o;

		if(this.column != temp.column || this.row!=temp.row) 
			throw new NotEqualsMatrixException("The Metrixs are not the same length");
		
		for(int i=0;i<this.column;i++)
			for(int j=0;j<this.row;j++) 
				if(this.data[i][j]!=temp.data[i][j])
					return false;
			
		return true;	
	}
	
	@Override
	public Matrix clone() throws CloneNotSupportedException{
		Matrix result=(Matrix)super.clone();
	    result.data=this.data.clone();
		return result;
	}
	
	
	public int valueAt(int i,int j) {
		if((i<0 || i>=this.data.length) || (j<0 || j>=this.data[i].length))
			throw new IllegalArgumentException("Index out of bounds");
		
		 return this.data[i][j];
	}






}

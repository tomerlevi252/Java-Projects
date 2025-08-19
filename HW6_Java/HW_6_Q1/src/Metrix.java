

public class Metrix {
	private int[][] data;

	public Metrix(int rows,int columns,int max,int min) {
		data=new int[rows][columns];

		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++) {
				data[i][j]=max+(int)(Math.random()*(max+min));
			}
	}

	public Metrix(Metrix copyMetrix) {
		int columns=copyMetrix.data.length;
		int rows=copyMetrix.data[0].length;

		this.data=new int[columns][rows];
		for(int i=0;i<rows;i++)
			for(int j=0;j<columns;j++) {
				this.data[i][j]=copyMetrix.data[i][j];
			}
	}

	public void show() {
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[0].length;j++) {
				System.out.print("|"+data[i][j]+"|");
			}
			System.out.println();
		}
	}

	public boolean isSquare() {
		return this.data.length==this.data[0].length;	
	}

	public boolean isIdentityMatrix() {
		if(this.isSquare()) {
			for(int i=0;i<this.data.length;i++) {
				for(int j=0;j<this.data[0].length;j++) {
					if(i==j) if(this.data[i][j]==1);

					else if(data[i][j]!=0) return false;
				}
			}
			return true;
		}
		return false;
	}

	public boolean isSymmetrical() {
		if(this.isSquare()) {
			for(int i=0;i< this.data.length;i++) {
				for(int j=0;j<this.data[0].length;j++) {
					if(this.data[i][j]==this.data[j][i]) ;
					else return false;	
				}
			}
			return true;
		}
		return false;
	}

	public boolean isEqual(Metrix other) {
		if(this.data.length==other.data.length && this.data[0].length==other.data[0].length) {
			for(int i=0;i<this.data.length;i++) {
				for(int j=0;j<this.data[0].length;j++) {
					if(this.data[i][j]!=other.data[i][j]) return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public boolean isUpperTriangular() {
		if(this.isSquare()) {
			for(int i=1;i<this.data.length;i++) {
				for(int j=0;j<this.data[0].length;j++) { 
					if(i>j) {
						if(this.data[i][j]!=0)return false;		
					}
					else break;
				}
			}
			return true;
		}
		return false;
	}
















}

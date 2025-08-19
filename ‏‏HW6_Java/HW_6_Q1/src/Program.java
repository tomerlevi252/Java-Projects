

public class Program {

	public static void main(String[] args) {
		Metrix m1=new Metrix(3, 3, 0, 10);
		Metrix m2=new Metrix(3,3,0,0);
		Metrix m3=new Metrix(m2);
		m2.data=new int[][]{{2,3,0,1,5},{0,6,4,0,1},{0,0,8,4,2},{0,0,0,8,2},{0,0,0,0,2}};
		m3.data=new int[][]{{1,0,0},{0,1,0},{0,0,1}};
		
		m2.show();
		System.out.println();
		
		System.out.println(m2.isSquare());
		System.out.println(m2.isSymmetrical());
		System.out.println(m1.isEqual(m2));
		System.out.println(m3.isUpperTriangular());

	}

}

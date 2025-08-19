

public class Utility{

	public static void showAll(Showable[] a) {
		for(int i=0;i<a.length;i++) 
			a[i].show();

	}

	public static void showAll(Object[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[i] instanceof Showable) 
				((Showable) a[i]).show();
			else System.out.println(a[i].toString());		
		}
	}

	public static boolean search(Object[] a,Object o) {
		boolean bool=false;
		if(o instanceof Comparable) bool=true;

		for(int i=0;i<a.length;i++) {
			if((a[i] instanceof Comparable) && bool)
				if(((Comparable) a[i]).compareTo(o)==0)
					return true;

				else if(a[i].equals(o))return true;	
		}
		return false;
	}

	public static Object max(Object[] a) {

		for(int i=0;i<a.length;i++) 
			if(!(a[i] instanceof Comparable))
				return null;

		for(int i=0;i<a.length-1;i++)
			if(!(a[i].getClass()==a[i+1].getClass()))
				return null;

		Object max=a[0];

		for(int i=1;i<a.length;i++) {
			if(((Comparable) a[i]).compareTo(max)>0) 
				max=a[i];
		}		
		return max;
	}


}

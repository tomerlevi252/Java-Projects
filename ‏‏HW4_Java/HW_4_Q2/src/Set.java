

public class Set {
	private int[] set;
	private int counter;

	public Set(int maxSize) {
		set=new int[maxSize];
		this.counter=0;
	}

	public boolean add(int num) {
		if(counter<set.length) {
			for(int i=0;i<counter;i++) 
				if(set[i]==num)return false;

			set[counter]=num;
			counter++;
			return true;
		}else return false;
	}

	public int find(int num) {
		for(int i=0;i<counter;i++) 
			if(set[i]==num)return i;		
		return -1;	
	}

	public void show() {
		System.out.print("(");

		for(int i=0;i<counter;i++) {
			if(i!=counter-1)
				System.out.print(set[i]+",");

			else System.out.print(set[i]);
		}

		System.out.println(")");	
	}

	public boolean isEmpty() {
		if(counter>0)return false;
		else return true;
	}

	public boolean isFull() {
		if(counter==set.length)return true;
		else return false;
	}

	public boolean remove(int num) {
		if(find(num)==-1)return false;
		else {
			for(int i=find(num);i<counter-1;i++) 
				set[i]=set[i+1];

			counter--;
		}return true;
	}
}











public class Set {
	private int[] group;
	private int counter=0;

	public Set() {
		this.group=new int[10];
		this.counter=0;
	}

	public Set(int size) {
		this.group=new int[size];
		this.counter=0;
	}

	public Set(int...n) {
		int[] t=new int[n.length];
		boolean add=true;
		int c=0;

		for(int i=0;i<n.length;i++) {
			for(int j=0;j<c;j++) {
				if(t[j]==n[i])
					add=false;
			}
			if(add) {
				t[c]=n[i];
				c++;
			}else add=true;	
		}
		if(c<2)group=new int[2];
		else this.group=new int[c];

		for(int i=0;i<c;i++)
			this.group[i]=t[i];
		counter=c;
	}

	public Set(Set s) {
		this.group=s.group;
		counter=0;
	}

	public boolean equals(Set s) {
		boolean bool=false;
		if(this.counter==s.counter) {
			for(int i=0;i<this.counter;i++) {
				for(int j=0;j<this.counter;j++) {
					if(this.group[i]!=s.group[j])
						bool=false;
					else {
						bool=true;
						break;
					}
				}
			}
		}
		return bool;
	}

	public Set union(Set s1) {
		Set newSet=new Set(this.counter+s1.counter);
		boolean bool=false;

		for(int i=0;i<this.counter;i++) {
			newSet.add(this.group[i]);
		}

		for(int i=0;i<s1.counter;i++) {
			for(int j=0;j<this.counter;j++) {
				if(newSet.group[j]!=s1.group[i]) 
					bool=true;
				else {
					bool=false;
					break;
				}
			}
			if(bool) newSet.add(s1.group[i]);
		}
		return newSet;	
	}


	public boolean add(int s1) {
		if(counter<this.group.length) {
			this.group[counter]=s1;
			counter++;
			return true;
		}
		return false;
	}

	public Set intersect(Set s1) {
		Set temp=new Set(this.counter+s1.counter);
		int c=0;
		for(int i=0;i<this.counter;i++) {
			for(int j=0;j<s1.counter;j++) {
				if(this.group[i]==s1.group[j]) {
					temp.group[c]=this.group[i];
					c++;
					break;
				}
			}
		}
		Set newSet=new Set(c);
		for(int i=0;i<c;i++)
			newSet.group[i]=temp.group[i];
		newSet.counter=c;
		return newSet;
	}

	public boolean subset(Set s1) {
		int c=0;
		for(int i=0;i<s1.counter;i++) 
			for(int j=0;j<this.counter;j++) {
				if(this.group[j]==s1.group[i]) {
					c++;
					break;
				}					
			}			
		if(this.group.length==c)return true;
		return false;
	}

	public void show() {
		System.out.print("[");
		if(this.counter==0)System.out.println("]");
		else{
			for(int i=0;i<this.counter;i++) {
			if(i==counter-1)
				System.out.print(this.group[i]+"]");
			else System.out.print(this.group[i]+",");
		}
		System.out.println();
		}
	}

	public Set subtract(Set s1) {
		Set temp=new Set();
		int c=0;
		boolean bool=false;
		for(int i=0;i<this.counter;i++) {
			for(int j=0;j<s1.counter;j++) {
				if(this.group[i]==s1.group[j]) {
					bool=false;
					break;
				}
				else bool=true;
			}
			if(bool) {
				temp.group[c]=this.group[i];
				c++;
			}
	  }
		Set newSet=new Set(c);
		for(int i=0;i<c;i++)
			newSet.group[i]=temp.group[i];
		newSet.counter=c;
		return newSet;
	}
	
	public int[] toArray() {
		int[] array=new int[this.counter];
		for(int i=0;i<this.counter;i++)
			array[i]=this.group[i];
		return array;
	}
}













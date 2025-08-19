

public class Set implements Arithmetic,ScanOp{
	private Object[] array;
	private int counter;
	private int secondCounter;

	public Set(int size,Object... group) {
		this.array=new Object[size];
		this.counter=0;
		this.secondCounter=0;
		for(int i=0;i<group.length;i++)
			addObject(group[i]);
	}

	public boolean addObject(Object other) {
		if(other!=null && counter<array.length) {
			boolean bool=true;
			
			for(int i=0;i<counter;i++) 
				if(array[i].equals(other))
					bool=false;

			if(bool) {
				array[counter++]=other;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {		
		String result="";
		for(int i=0;i<counter;i++) {
			result=result.concat("("+String.valueOf(array[i].getClass())+"):");
		}
		
		return result;
	}

	@Override
	public Set add(Object other)
	{
		if(other instanceof Set)
		{
			Set obj=(Set)other;
			Set temp=new Set(counter+obj.counter);

			for(int i=0;i<counter;i++)
				temp.addObject(array[i]);

			for(int i=0;i<obj.counter;i++)
				temp.addObject(obj.array[i]);

			Set result=new Set(temp.counter);

			for(int i=0;i<temp.counter;i++)
				result.array[result.counter++]=temp.array[i];

			return result;
		}
		return null;
	}

	@Override
	public Set sub(Object other)
	{
		if(other instanceof Set)
		{
			Set objRemove=mul((Set)other);
			Object[] dArray=array.clone();

			for(int i=0; i<objRemove.counter; i++)
				for(int j=0;j<counter;j++)
					if(objRemove.array[i].equals(dArray[j]))
						dArray[j]=null;

			Set result=new Set(counter-objRemove.counter);

			for(int i=0;i<counter;i++)
				if (dArray[i]!=null)
					result.array[result.counter++]=dArray[i];

			return result;
		}
		return null;
	}

	@Override
	public Set mul(Object other)
	{
		if(other instanceof Set)
		{
			Set obj=(Set)other;
			Object[] inte=new Object[counter];
			int inteCounter=0;

			for(int i=0;i<counter;i++)
				for(int j=0;j<obj.counter; j++)
					if(array[i].equals(obj.array[j]))
						inte[inteCounter++]=array[i];

			Set result=new Set(inteCounter);

			for(int i=0;i<inteCounter;i++)
				result.array[result.counter++]=inte[i];

			return result;
		}
		return null;
	}

	@Override
	public Set div(Object obj)
	{
		return null;
	}

	public Object[] objectsClass(Class c)
	{
		Object[] temp=new Object[counter];
		int tempCounter=0;

		for(int i=0;i<temp.length;i++) 
			if(array.getClass()==c) 
				temp[tempCounter++]=array[i];

		Object[] result=new Object[tempCounter];

		for(int i=0;i<tempCounter;i++)
			result[i]=temp[i];

		return result;
	}

	public Class[] otherObjects() {
		if(counter==0) return new Class[0];
		int tempCounter=0;
		Class[] temp=new Class[this.counter];

		for(int i=0;i<temp.length;i++) {
			boolean bool=true;

			if(temp[i]==array[i].getClass()) {
				bool=false;
				break;
			}

			if(bool)temp[tempCounter++]=array[i].getClass()	;		
		}

		Class[] result=new Class[tempCounter];

		for(int i=0;i<result.length;i++)
			result[i]=temp[i];

		return result;	
	}

	@Override
	public void reset(){
		secondCounter=0;
	}

	@Override
	public boolean forward(){
		if (secondCounter<counter-1){
			secondCounter++;
			return true;
		}

		return false;
	}

	@Override
	public boolean backward(){
		if (secondCounter>0){
			secondCounter--;
			return true;
		}

		return false;
	}

	@Override
	public Object getCurrent(){
		return array[secondCounter];
	}

}

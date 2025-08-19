

public class DrawingBoard {
	private Shape[] ShapeArray;
	private int counter;

	public DrawingBoard(int size) {
		ShapeArray=new Shape[size];
	}

	public boolean add(Shape... s) {
		if(counter+s.length<ShapeArray.length) {
			for(int i=0;i<s.length;i++)
				ShapeArray[counter++]=s[i];
		}
		else {
			Shape[] newArray= new Shape[(int)(ShapeArray.length+s.length*1.5)];
			for(int i=0;i<ShapeArray.length;i++) 
				newArray[i]=ShapeArray[i];

			for(int i=0;i<s.length;i++) 
				newArray[counter++]=s[counter];

			ShapeArray=newArray;
		}
		return true;
	}

	public void showAll() {
		for(int i=0;i<ShapeArray.length;i++) {
			ShapeArray[i].show();
			System.out.println("-------------------------");
		}
	}

	public Shape getMax() {
		Shape result=null;
		for(int i=0;i<ShapeArray.length-1;i++) {
			if(ShapeArray[i].compare(ShapeArray[i+1])==1)
				result=ShapeArray[i];
			else if(ShapeArray[i].compare(ShapeArray[i+1])==-1)
				result=ShapeArray[i+1];
			else result=ShapeArray[i];
		}
		return result;
	}

	public ThreeDimension getMax3DV1() {
		ThreeDimension result=null;
		double maxVolume=0;
		for(int i=0;i<ShapeArray.length;i++) 
		{
			if(ShapeArray[i].whoAmI().indexOf(0)=='3') 
			{
				ThreeDimension temp=(ThreeDimension)(ShapeArray[i]);
				if(temp.getVolume()>maxVolume) 
				{
					maxVolume=temp.getVolume();
					result=temp;
				}
			}
		}
		return result;
	}

	public ThreeDimension getMax3DV2() {
		ThreeDimension result=null;
		double maxVolume=0;
		for(int i=0;i<ShapeArray.length;i++) 
		{
			if(ShapeArray[i] instanceof ThreeDimension) 
			{
				ThreeDimension temp=(ThreeDimension)(ShapeArray[i]);
				if(temp.getVolume()>maxVolume) 
				{
					maxVolume=temp.getVolume();
					result=temp;
				}
			}
		}
		return result;
	}

	public Class[] getTypes() {
		Class[] temp=new Class[counter];
		temp[0]=ShapeArray[0].getClass();
		boolean bool=true;
		int count=0;


		for(int i=0;i<temp.length;i++) {
			for(int j=0;j<temp.length;j++) {
				if((temp[i]==ShapeArray[j].getClass()))
					bool=false;
			}
			if(bool) {
				temp[i]=ShapeArray[i].getClass();
				count++;
			}
			bool=true;
		}

		Class[] result=new Class[count];

		for(int i=0;i<count;i++)
			result[i]=temp[i];

		return result;
	}
















}

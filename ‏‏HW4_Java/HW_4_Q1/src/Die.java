

public class Die {
	private int numOfSides;
	private int[] statistics;
	private int lastToss;

	public Die(){
		this(6);
	}

	public Die(int n) {
		numOfSides=n;
		statistics=new int[numOfSides];
	}

	public int rollDie(boolean unique){
		int result;

		if(unique) {
			do {
				result=1+(int)(Math.random()*numOfSides);
			}
			while(result==lastToss);
			
			lastToss=result;
		}else result=1+(int)(Math.random()*numOfSides);

		statistics[result-1]++;
		return result;
	}

	public void showStatistics(){
		int k;
		for (k=0; k<numOfSides ; k++)
			System.out.println(k+1 + ":" + statistics[k]);
		System.out.println("Most frequent digit is: "+getMostFrequent());
	}

	private int getMostFrequent() {
		int mostNumber=statistics[0];
		int num=1;

		for(int i=1;i<numOfSides;i++) {
			if(statistics[i]>mostNumber) {
				mostNumber=statistics[i];
				num=i+1;
			}
		}
		return num;	
	}

	public int[] getAllMostFrequents() {
		int[] mostNumbers;
		int count=0;
		int num=statistics[0];

		for(int i=1;i<numOfSides;i++) {
			if(statistics[i]>num)
				num=statistics[i];
		}

		for(int i=0;i<numOfSides;i++) {
			if(statistics[i]==num)
				count++;
		}

		if(count>0) {
			mostNumbers=new int[count];
			int place=0;
			for(int i=0;i<numOfSides;i++) {
				if(statistics[i]==num) {
					mostNumbers[place]=i+1;
					place++;
				}
			}
			return mostNumbers;
		}else return null;

	}	
}













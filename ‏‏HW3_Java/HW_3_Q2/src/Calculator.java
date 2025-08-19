

public class Calculator {
	
	public int countDigits(int n) {
		int c=0;
		while(n>0) {
			c++;
			n/=10;
		}
		return c;
	}
	
	public boolean evenOdd(int n) {
		int even=0,odd=0;
		while(n>0) {
			if((n%10)%2==0)even=even+n%10;
			else odd=odd+n%10;
			n/=10;
		}
		if(even>odd)return true;
		else return false;
		
	}
	
	public int getLastDigit(int n) {
		int a=0;
		while(n>0) {
			a=n%10;	
			n/=10;
		}
		return a;
	}
	
	public int getDigit(int num,int k) {
		for(int i=0;i<k;i++) {
			num/=10;
		}
		return num%10;
	 
		
	}
	
	public int setDigit(int num,int k,int d) {
		int a=(int)Math.pow(10,k+1);
		int b=num%a;
		int c=a/10;
		int e=d*c;
		num=(num-b)+e+(b%c);
		return num;
		
	}
	
	public int getLastDigit2(int n) {
		int c=countDigits(n);
		int d=getDigit(n, c);
		return d;
		
	}

	public int countMinDigit(int num) {
		int n=10,c=0;
		while(num>0) {
			if(num%10>n)num/=10;
			else if(num%10<n) {
				n=num%10;
				num/=10;
				c++;
			}else if(num%10==n) {
				c++;
				num/=10;
			}
	}
		return c;
	}
	
	public boolean isSymmetric(int num) {
		int a=0,temp=num;
		int c=countDigits(num)-1;
		
		while(temp>0) {
			if(getDigit(num,a)!=getDigit(num,c-a))return false;
			a++;
			temp/=10;
		}
		return true;
	}
	
	public int search(int num,int d) {
		int k=0,c=0;
		int temp=num;
		while(temp>0) {
			if(getDigit(num,k)==d) {
				c++;
				k++;
			}else k++;
			temp/=10;
		}
		return c;	
	}
		
	
	
	
	
	
	
	
	
}

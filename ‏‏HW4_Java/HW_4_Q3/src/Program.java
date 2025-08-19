import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("The Start");
		while(true) {
			String array=s.nextLine();
			if(array.isEmpty())break;
			System.out.println(unspare(array));

			System.out.println(reverse(array));			
		}
		System.out.println("The End");
	}

	public static String reverStr(String st) {
		String[] s1=st.split(" ");
		String s2="";

		for(int i=s1.length;i>0;i--) 
			s2=s2.concat(s1[i-1]+" ");	

		return s2;	
	}

	public static String reverse(String st) {
		String[] s1=st.split(" ");
		String s2="";
		String s3="";

		for(int i=0;i<s1.length;i++) {
			s2=s1[i];
			s2=s2.replace(""," ");
			s2=reverStr(s2);
			s2=s2.replace(" ","");
			s3=s3.concat(s2+" ");
		}
		return s3;
	}

	public static String unspare(String myStr) {	
		String[] s1=myStr.split(" ");
		String[] s2;
		String result="";
		for(int i=0;i<s1.length;i++) {
			s2=s1[i].split("");

			for(int k=0;k<s2.length-1;k++) {
				for(int p=1+k;p<s2.length;p++) {
					if(s1[i].charAt(k)==s1[i].charAt(p)) 
						s2[p]="";							
				}
			}

			for(int m=0;m<s2.length;m++)
				result+=s2[m];

			result+=" ";
		}
		System.out.println();
		return result;

	}


}









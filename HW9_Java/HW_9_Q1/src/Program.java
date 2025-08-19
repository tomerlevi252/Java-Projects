
public class Program {

	public static void main(String[] args) throws CloneNotSupportedException {
		Rational r1=new Rational();
		System.out.println(r1.toString());
		Rational r2=new Rational(2,2);
		Rational r3=new Rational(r2);
		
		Rational r4 =(Rational) r2.clone();
	}

}

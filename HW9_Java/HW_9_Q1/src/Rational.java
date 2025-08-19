

public class Rational implements Showable,Arithmetic,Cloneable{
	private int mone,mechane;

	public Rational(int mone,int mechane) {
		if(mechane!=0) {
			this.mone=mone;
			this.mechane=mechane;
		}
		else System.out.println("Mechane cant be 0, try again.");

	}

	public Rational() {
		this(1,2);
	}

	public Rational(Rational r) {
		this(r.mone,r.mechane);
	}

	@Override
	public String toString() {
		return mone+"/"+mechane;
		//String.valueOf(this.mone)+"/"+String.valueOf(this.mechane);	עובד גם
	}

	@Override
	public boolean equals(Object o) {
		if(this==o)return true;
		if(o==null || o.getClass()!=this.getClass())return false;

		Rational r=(Rational)o;
		return this.mone*r.mechane==r.mone*this.mechane;
	}

	@Override
	public void show() {
		System.out.println(this.mone+"/"+this.mechane);
	}

	@Override
	public Rational add(Object o) {
		if(!(o instanceof Rational))return null;

		Rational r=(Rational)o;
		int x=this.mone*r.mechane + r.mone*this.mechane;
		int y=this.mechane*r.mechane;
		return new Rational(x,y);		
	}

	@Override
	public Rational sub(Object o) {
		if(!(o instanceof Rational))return null;

		Rational r=(Rational)o;
		int x=this.mone*r.mechane - r.mone*this.mechane;
		int y=this.mechane*r.mechane;
		return new Rational(x,y);		
	}

	@Override
	public Rational mul(Object o) {
		if(!(o instanceof Rational))return null;

		Rational r=(Rational)o;
		int x=this.mone*r.mone;
		int y=this.mechane*r.mechane;
		return new Rational(x,y);	
	}

	@Override
	public Rational div(Object o) {
		if(!(o instanceof Rational))return null;

		Rational r=(Rational)o;
		int x=this.mone*r.mechane;
		int y=this.mechane*r.mone;
		return new Rational(x,y);		
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

}





















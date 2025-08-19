import java.util.Date;

public class XDate extends Date {
	
	public XDate(int date ,int month, int year) {
		super(year-1900,month-1,date);
	}
	
	public XDate(long n) {
		super(n);
	}

	public int getMonth() {
		return super.getMonth()+1;
	}
	
	public int getYear() {
		return super.getYear()+1900;
	}
	
	public XDate addDays(long days) {
		long secTime=super.getTime();
		days=days*24*60*60*1000L;
		secTime+=days;
		return new XDate(secTime);
	}
	
    public static XDate now() {
        return new XDate(new Date().getDate(),new Date().getMonth()+1,new Date().getYear()+1900);
    }
}

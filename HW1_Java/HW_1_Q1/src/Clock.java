
public class Clock {
	private int hours;
    private int minutes;
    private int seconds;
    private int milliseconds;
    
    public void tick () {
    	milliseconds=milliseconds+1;
    	seconds=seconds+milliseconds/60;
    	minutes=minutes+seconds/60;
    	hours=hours+minutes/60;
    	milliseconds=milliseconds%60;
    	seconds=seconds%60;
    	minutes=minutes%60;
    	hours=hours%24;
    }

    public void show(){
        System.out.println("Current time: "+hours+":"+minutes+":"+seconds+":"+milliseconds);
    }
    public void setMidNight() {
    	hours=0;
    	minutes=0;
    	seconds=0;
    	milliseconds=0;
    }
    public void setMidDay(){
    	hours=12;
    	minutes=0;
    	seconds=0;
    	milliseconds=0;    	
    }
    

} 
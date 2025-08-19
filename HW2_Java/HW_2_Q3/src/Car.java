

public class Car {
	private int speed;
	private int maxSpeed;
	private String plate;
	
	public Car(String p, int s) {
		plate=p;
		maxSpeed=s;
		speed=0;
	}
	
	public void speedUp() {
		if(speed<maxSpeed)speed++;
		
	}
	
	public void speedUp(int s) {
		if((s>=0) && (speed+s<=maxSpeed))speed+=s;
	}

	public void speedDown() {
		if(speed>0)speed--;
	}
	
	public void speedDown(int s) {
		if((s>=0) && (speed-s>0))speed-=s;
	}
	
	public void stop() {
		speed=0;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void show() {
		System.out.println("Car's Plate is: "+plate);
		System.out.println("Car's Max Speed is: "+maxSpeed);
		System.out.println("Car's Speed is: "+speed);
		System.out.println("");
	}

}
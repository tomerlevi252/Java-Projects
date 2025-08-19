
public class Car {
	private int speed;
	
	public void speedUp() {
		speed = speed+1-speed/10;
		
	}

	public void speedDown() {
		speed = speed-1;
        int temp = (speed+10)/10;
        speed = speed*temp;
	}
	
	public void stop() {
		speed=0;
	}
	
	public void show() {
		System.out.println("Car's speed is: "+speed);
		System.out.println("");
	}

}

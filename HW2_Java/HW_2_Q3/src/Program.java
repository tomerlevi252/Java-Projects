
public class Program {

	public static void main(String[] args) {
		Car car1 = new Car("12345", 120);
		Car car2 = new Car("123456", 100);
		
		car1.speedUp(5);
		car2.speedUp();
		
		car1.show();
		car2.show();
		
		int rnd = (int)(Math.random()*150+50);
		
		car2.speedUp(rnd);
		if(car2.getSpeed()!=30) {
			car2.stop();
			car2.speedUp(30);
		}
		car2.show();

	}

}

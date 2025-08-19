

public class Program {

	public static void main(String[]args) {
		LockableDoor d1= new LockableDoor();
		d1.show();
		d1.lock();
		d1.show();
		
		System.out.println();
		
		d1.close();
		d1.lock();
		d1.show();
		
		System.out.println();
		
		d1.unLock();
		d1.show();

	}



}

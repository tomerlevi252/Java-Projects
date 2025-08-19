

public class LockableDoor extends Door{
	public boolean lock;
	
	public LockableDoor() {
		super(true);
		this.lock=false;
	}
	
	public void openDoor() {
		if(super.isOpen() && this.lock) {
			super.open();
		}
		System.out.println("The Door is Lock");
	}
	
	public void close() {
		super.close();
	}
	
	public void lock() {
		if(super.isOpen()==false) 
			this.lock=true;
		else System.out.println("The Door is not close, cant lock the door");
	}
	
	public void unLock() {
		this.lock=false;
	}
	
	public void show() {
		if(super.isOpen())
			System.out.println("The door is open");
		else if(lock)
			System.out.println("The door is close and lock");
		else 
			System.out.println("The door is close");
	}
	
	
	
	
}

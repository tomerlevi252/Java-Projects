
public class List {

	private ListNode firstNode;
	private ListNode lastNode;
	private String name;

	public List(){
		this("list");
	}

	public List(String listName){
		name=listName;
		firstNode=lastNode=null;
	}

	public void insertAtFront(Object insertItem){
		if(isEmpty())
			firstNode=lastNode=new ListNode(insertItem);
		else
			firstNode=new ListNode(insertItem,firstNode);
	}

	public void insertAtBack(Object insertItem){
		if(isEmpty())
			firstNode=lastNode=new ListNode(insertItem);
		else
			lastNode=lastNode.nextNode=new ListNode(insertItem);
	}

	public Object removeFromFront()throws EmptyListException{
		if(isEmpty())
			throw new EmptyListException(name);
		Object removedItem=firstNode.data;

		if(firstNode==lastNode)
			firstNode=lastNode=null;
		else
			firstNode=firstNode.nextNode;
		return removedItem;
	}

	public Object removeFromBack() throws EmptyListException{
		if(isEmpty())
			throw new EmptyListException(name);

		Object removedItem=lastNode.data;
		if(firstNode==lastNode)
			firstNode=lastNode=null;
		else{
			ListNode current=firstNode;

			while(current.nextNode!=lastNode)
				current=current.nextNode;

			lastNode=current;
			current.nextNode=null;
		}
		return removedItem;
	}

	public boolean isEmpty(){
		return firstNode==null;
	}

	public void print(){
		if(isEmpty()){
			System.out.print("Empty %s\n"+name);
			return;
		}
		System.out.print("The %s is : ,"+name);
		ListNode current=firstNode;

		while(current != null){
			System.out.printf("%s",current.data);
			current=current.nextNode;
		}
		System.out.println("\n");
	}

	@Override
	public String toString() {
		if(isEmpty())return "()";
		
		String result="(";

		for(ListNode node=firstNode; node!=null;node=firstNode.getNext()) {
			if(node.getNext()!=null)
				result+=node.getObject()+",";

			else result+=")";
		}
		return result;
	}
	
	public Object removeAt(int k){
		int count=0;
		for(ListNode node=firstNode; node!=null;node=firstNode.getNext()) 
			count++;

		if(k>count || k<0)
			throw new ListIndexOutOfBound("Out of Bound");

		if(this.isEmpty())return null;

		if(k==0)
			return this.removeFromFront();

		if(k==count)
			return this.removeFromBack();

		count=0;
		Object result;
		for(ListNode node=firstNode; node!=null ;node=firstNode.getNext()) {
			if(count==k-1) {
				result=node.getNext().getObject();
				node.setNext(node.getNext().getNext());
				return result;
			}
			else count++;
		}
		return null;
	}

	public void show() {
		if(isEmpty()) 
			return;
	    firstNode.show();
	}
	
	public void showRev() {
		if(isEmpty()) 
			return;
	    firstNode.show();	
	}

	public boolean addAt(Object obj, int k) {
		int count=0;
		for(ListNode node=firstNode; node!=null;node=firstNode.getNext()) 
			count++;

		if(k>count || k<0)
			throw new ListIndexOutOfBound("Out of Bound");
		
		if(this.isEmpty())return false;
		
		if(k==0) {
			this.insertAtFront(obj);
			return true;
		}

		if(k==count) {
			this.insertAtBack(obj);
			return true;
		}
		
		count=0;
		for(ListNode node=firstNode; node!=null ;node=firstNode.getNext()) {
			if(count==k-1) {
				node.setNext(new ListNode(obj,node.getNext()));
				return true;
			}
			count++;
		}
		return false;
	}
	

	public Object[] toArray() {
		if(this.isEmpty())return null;
		
		int count=0;
		for(ListNode node=firstNode; node!=null;node=firstNode.getNext()) 
			count++;
		
		Object[] arrayObjects=new Object[count];
		count=0;
		
		for(ListNode node=firstNode; node!=null ;node=firstNode.getNext()) 
			arrayObjects[count++]=node.getObject();
		
		return arrayObjects;
	}

	
	
	
	
	
	
	
	
	
	
	
}
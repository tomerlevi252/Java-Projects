
public class ListNode {

	Object data;
	ListNode nextNode;

	public ListNode(Object o){
		this(o,null);
	}
	
	public ListNode(Object o,ListNode node){
		data=o;
		nextNode=node;
	}
	
	public Object getObject(){
		return data;
	}
	
	public ListNode getNext(){
		return nextNode;
	}
	
	public void setNext(ListNode ln){
		nextNode = ln;
	}
	
	public void show() {
		System.out.println(this.data+" ");
		if(this.nextNode==null)
			return;
		this.nextNode.show();
	}
	
	public void showRev() {
		if(this.nextNode==null)
			return;
		this.nextNode.show();
		System.out.println(this.data+" ");
	}

	
	
	
	
}
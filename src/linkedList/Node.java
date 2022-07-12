package linkedList;


public class Node {
	public int data;
	public Node next;
	
	public Node(int data) {
		super();
		this.data = data;
		this.next = null;
		
	
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}

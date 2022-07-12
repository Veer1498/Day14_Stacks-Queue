package stack;
import linkedList.LinkedList;
import linkedList.Node;
/**
 * 
 * Stacks and Queue Program.
 * @author Veer.singa
 *
 */
public class Stacks {
	/**
	 * 1.Created a Class Stacks
	 * 2.Imported Methods and Classes from LinkedList package.
	 * 3.Created 3 Methods Push,Peak,Pop.
	 * 
	 */
	private Node top;
	private LinkedList linkedList;
	
	//Constructor of Stacks Class
	public Stacks() {
		this.linkedList = new LinkedList();
	}
	
	//Push Method
	public void push () {
		/*
		 * Calling Method AddNode from Linked List.
		 * Giving Element Data of all 3.
		 * Print the the Stack
		 */
		linkedList.addNode(70);
		linkedList.addNode(30);
		top = linkedList.addNode(56);
		linkedList.printLinkedList();
		
	}
	
	// Peak Method
	public  void Peak() {
		/*
		 * Calls Push method and Prints Top Element.
		 */
		push();
		System.out.println("\n Top element is "+this.top.data);
		
	}
	
	// pop method
	public void pop() {
		/**
		 * 1.Printed the Before added Stack
		 * 2.Called the Method Push from this class.
		 * 3.Created a While loop to pop the elements until stack become null.
		 * Print the After Changes Stack
		 */
		System.out.println("Before Changes..");
		linkedList.printLinkedList();
		push();
		Node temp = top;
		while(temp != null) {
			linkedList.pop();
			temp = temp.next;
			System.out.println("After Changes..");
			linkedList.printLinkedList();
		}
		
	}

}

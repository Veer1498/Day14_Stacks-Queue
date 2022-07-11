package stack;

import linkedList.LinkedList;
import linkedList.Node;

public class Stacks {
	private Node top;
	private LinkedList linkedList;
	
	public Stacks() {
		this.linkedList = new LinkedList();
	}
	
	public void addNode () {
		linkedList.addNode(70);
		linkedList.addNode(30);
		top = linkedList.addNode(56);
		linkedList.printLinkedList();
		
	}

}

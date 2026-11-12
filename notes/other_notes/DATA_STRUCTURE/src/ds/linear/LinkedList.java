package ds.linear;

public class LinkedList {

	private Node head = null;
	
	private class Node
	{
		private Object item;
		private Node next;
		
		private Node(Object item, Node next)
		{
			this.item = item;
			this.next = next;
		}
	}
	public void addNode(Object item)
	{ 
		Node node = new Node(item, null); 
		
		if(head == null)
		{	
			head = node; 
			return;
		}
			
		Node tempNode = head;
		
		while(tempNode.next != null)
		{ 
			tempNode = tempNode.next;
		}
		
		tempNode.next = node;
		
	}
	public void printLinkedList()
	{
		Node tempNode = head;
		while(tempNode != null)
		{
			System.out.println("Item = "+tempNode.item+"  @  "+tempNode+" || "+tempNode.next);
			tempNode = tempNode.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.addNode(1);
		link.addNode("2");
		link.addNode("Three");
		link.addNode(4);
		link.addNode(5);
		link.addNode("Six");
		link.addNode(7);
		
		link.printLinkedList();
		
	}

}

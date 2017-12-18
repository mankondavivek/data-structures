package ds.linkedlists.basic;

public class MyLinkedList {

	Node headNode;
	
	public MyLinkedList() {
		headNode = null;
	}
	public MyLinkedList(Node head) {
		headNode = head;
	}

	public void printList() {

		if (headNode == null) {
			System.out.println("Empty List.");
			return;
		}

		Node node = headNode;

		while (node != null) {

			System.out.println(node.data + "\t");
			node = node.nextNode;
		}
	}
	
	public int length() {
		
		int len = 0;
		if(headNode != null)
		{
			Node currentNode = headNode;
			while(currentNode != null) {
				len++;
				currentNode = currentNode.nextNode;
			}	
			return len;
		}		
		return len;
	}

	public Node insertNode(Node newNode) {

		Node currentNode = headNode;

		if (headNode == null) {
			headNode = newNode;
			return headNode;
		}

		while (currentNode.nextNode != null) {
			currentNode = currentNode.nextNode;
		}

		currentNode.nextNode = newNode;
		return newNode;
	}
	
	public Node insertNode(Node newNode, int position) {
		
		Node currentNode = headNode;
		//TODO
		
		return currentNode;
	}
	
	public boolean deleteNode(int position) {
		
		if(headNode == null) {
			System.err.println("Delete failed : List already empty.");
			return false;
		}
		
		Node currentNode = headNode;
		for(int i = 1; i < (position-1); i++)
		{
			if(currentNode == null)
			{
				System.err.println("Delete failed : Position not found.");
				return false;
			}
			currentNode = currentNode.nextNode;
		}
		currentNode.nextNode = currentNode.nextNode.nextNode;
		return false;
	}
	
	public boolean deleteNode(Node node) {
		
		Node currentNode = headNode;
		
		while(currentNode != null) {
			if(currentNode.nextNode.equals(node))
			{
				currentNode.nextNode = currentNode.nextNode.nextNode;
				node = null;
				return true;
			}
			currentNode = currentNode.nextNode;
		}
		System.err.println("Delete failed : List already empty.");
		return false;
	}

	public boolean deleteNode(double data) {
		
		Node currentNode = headNode;
		
		while(currentNode != null) {
			if(currentNode.nextNode.data == data)
			{
				currentNode.nextNode = currentNode.nextNode.nextNode;
				return true;
			}			
			currentNode = currentNode.nextNode;
		}
		return false;
	}

	public static void main(String args[]) {

		MyLinkedList myLinkedList = new MyLinkedList(null);
		
		myLinkedList.insertNode(new Node(200));
		myLinkedList.insertNode(new Node(300));
		myLinkedList.insertNode(new Node(400));
		myLinkedList.insertNode(new Node(500));
		
		myLinkedList.printList();
		System.out.println(myLinkedList.length());
		
		myLinkedList.deleteNode(3);
		myLinkedList.printList();
		System.out.println(myLinkedList.length());
	}
}
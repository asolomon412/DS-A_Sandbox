public class LinkedList {
	private Node head;
	private Node current;// This will have latest node
	public int count = 0;

	public LinkedList() {
		head = new Node();
		current = head;
	}

	public void addAtStart(Object data) {
		Node newNode = new Node();
		newNode.value = data;
		newNode.next = head.next;// new node will have reference of head's next reference
		head.next = newNode;// and now head will refer to new node
		count++;
	}

	public void removeFromStart() {
		if (count > 0) {
			head.next = head.next.next;
			count--;
		} else {
			System.out.println("No element exist in this linked list.");
		}
	}

	public void printAllNodes() {
		System.out.println("Head ->");
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
			System.out.println(curr.value);
			System.out.println("->");
		}
		System.out.println("NULL");
	}
}
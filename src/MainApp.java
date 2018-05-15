
public class MainApp {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtStart("hello");
		list.insert("Antonella");
		list.addAtStart("hello2");
		
		list.printAllNodes();
		System.out.println(list.isFull());
		System.out.println(list.length());
	}

}

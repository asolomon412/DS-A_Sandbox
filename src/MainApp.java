import java.util.Arrays;

public class MainApp {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		List list2 = new List();
		list2.insert("Antonella");
		System.out.println(list2);
		list.addAtStart("hello");
		//list.insert("Antonella");
		list.addAtStart("hello2");
		
		list.printAllNodes();
		
	}

}

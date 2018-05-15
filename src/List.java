public class List {
	private String items[] = new String[100];
	private int count = 0;

	public int length() {
		return count;
	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
//		if (count == items.length)
//			return true;
//		else
//			return false;
		return count == items.length ? true : false;
	}

	public boolean insert(String newItem) {
		if (count == items.length)
			return false;
		items[count] = newItem;
		count++;
		return true;
	}
	
	
}
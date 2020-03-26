
public class Runner {

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.insert(5);
		list.insert(18);
		list.insert(52);
		list.insert(35);
		list.insertAtStart(135);
		list.insertAt(2, 55);
		list.show();
	}
}


public class LinkedList 
{
	Node head;	
	


	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node temp = head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	
	public void insertAt(int index,int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(index==0)
		{
			insertAtStart(data);
		}
		else 
		{		
			Node temp = head;
			
			
			for(int i=0;i<index-1;i++)
			{
				temp = temp.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
	}
	
	public void show()
	{
		Node snode = head;
		
		while(snode.next!=null)
		{
			System.out.println(snode.data);
			snode = snode.next;
		}
		System.out.println(snode.data);
	}
}

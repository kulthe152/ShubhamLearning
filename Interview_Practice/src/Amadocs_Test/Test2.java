package Amadocs_Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//  not working

public class Test2 
{
	
	private void removeNumbers(List<Integer>numbers,int num)
	{
		for(Iterator<Integer>iter=numbers.iterator();iter.hasNext();)
		{
			int nextNum = iter.next();
			if(nextNum>num);
				numbers.remove(num);
		}
	}
	
	public static void main(String[] args) 
	{
		List<Integer>numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);	
		Test2 t2 = new Test2();
		t2.removeNumbers(numbers, 0);
	}
}

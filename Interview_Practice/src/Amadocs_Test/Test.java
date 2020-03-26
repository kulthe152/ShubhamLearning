package Amadocs_Test;

import java.util.LinkedList;
import java.util.Stack;

//output: false

public class Test {

	public static void main(String[] args) {
		LinkedList<Box>listBoxes=new LinkedList<>();
		Stack<Box>anotherBoxList = new Stack<>();
		
		Box a = new Box(5.1f,"india");
		Box b = new Box(3.7f,"japan");
		Box c = new Box(8.2f,"Thailand");
		
		listBoxes.add(a);
		listBoxes.add(b);
		listBoxes.add(c);
		
		anotherBoxList.push(a);
		anotherBoxList.push(b);
		anotherBoxList.push(c);
		
		//poll() : return first value or object
		//pollLast() : return last value or object
		
		System.out.println(listBoxes.poll());
		System.out.println(anotherBoxList.pop());
	} 
}

class Box
{
	private float weight;
	private String adderess;
	
	public Box(float weight, String adderess) {
		super();
		this.weight = weight;
		this.adderess = adderess;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getAdderess() {
		return adderess;
	}

	public void setAdderess(String adderess) {
		this.adderess = adderess;
	}
}

package Amadocs_Test;

public class Test4 
{
	public static void main(String[] args) 
	{
		int first = 100;
		int second = 200;
		swapValues(first,second);
		System.out.println("main mde first "+first);
		System.out.println("main mde second "+second);
	}
	
	public static void swapValues(int first,int second)
	{
		int temp = first;
		
		System.out.println("temp ahe "+temp);
		System.out.println("second ahe "+second);
		
		first = second;
		System.out.println(first);
		second = temp;
		System.out.println(second);
	}
}

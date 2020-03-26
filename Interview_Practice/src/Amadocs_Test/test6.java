package Amadocs_Test;

public class test6 
{ 
	private test6(int a)
	{
	}
	
	public static void main(String[] args) 
	{
		Class cls = Class.forName("test6");
		test6 t = (test6)cls.newInstance();
		System.out.println(t.getClass().getName());
	}
}

package Amadocs_Test;

import javax.management.RuntimeErrorException;

public class test5 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("in try block");
			throw new RuntimeErrorException();
		}finally {
			System.out.println("in finally block");
		}
	}
}

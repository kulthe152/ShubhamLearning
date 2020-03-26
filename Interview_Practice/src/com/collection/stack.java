package com.collection;

import java.util.Stack;

public class stack {

	public static void main(String[] args) 
	{
		Stack<String> s = new Stack<String>();
		s.push("ratan");
		s.push("anu");
		s.push("durga");
		System.out.println(s);
		
		System.out.println(s.search("ratan"));
		
		//s.pop();
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.empty());
		
		s.clear();
		
		System.out.println(s.empty());
	}
}

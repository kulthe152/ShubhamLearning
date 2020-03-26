package Amadocs_Test;

import java.util.ArrayList;
import java.util.List;

//will get error

public class Test3 {

	public static void main(String[] args) 
	{
		List<String>nameList=new ArrayList<>();
		String fnm = "Luk";
		String secnm = "David";
		Object thrnm = "Michael";
		nameList.add(fnm);
		nameList.add(secnm);
		nameList.add(thrnm);
		System.out.println(nameList.size());
	}
}

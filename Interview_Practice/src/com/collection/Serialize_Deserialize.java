package com.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialize_Deserialize 
{
	void serializationDemo() throws IOException
	{
		Emp e = new Emp(111,"shubham");
		FileOutputStream fos = new FileOutputStream("pqr.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("\n Serialization process completed");
	}
	
	void deserializationDemo() throws IOException, ClassNotFoundException
	{
		FileInputStream fis = new FileInputStream("pqr.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Emp e = (Emp)ois.readObject();
		System.out.println(e.eid+" "+e.ename);
		ois.close();
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Serialize_Deserialize sd = new Serialize_Deserialize();
		sd.serializationDemo();
		sd.deserializationDemo();
	}
}

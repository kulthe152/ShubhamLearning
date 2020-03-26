import java.io.*;
public class primenumber
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number for check Prime number or not:->");
		int n = Integer.parseInt(br.readLine());
		
		boolean p = true;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				p = false;
			}
		}
		if(p==true)
			System.out.println(n+" is Prime number.");
		else
			System.out.println(n+" is Not prime number");
	}
}

//public class primenumber
//{
//	public static void main(String args[])
//	{
//		String m1 = "hello";
//		//String m2 = m1.sub
//		//boolean isDivisibleBy5 = int0 % 5 == 0;
//		
//		boolean isHeal(String str)
//		{
//			
//		}
//		
//	}
//}
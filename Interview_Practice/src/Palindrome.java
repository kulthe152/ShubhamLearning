import java.io.*;

public class Palindrome 
{
	public static void main(String args[])throws IOException
	{
		int r,temp,s=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number for check palindrome or not.");
		int n = Integer.parseInt(br.readLine());
		temp = n;
		
		public void addedMethod(){
			System.out.println("Added business logic by another developer");
		}
		
		while(n!=0)
		{
			r = n % 10;
			n = n / 10;
			s = s * 10 + r;
		}
		if(temp == s)
			System.out.println("Number is palindrome");
		else
			System.out.println("number is not palindrome");
	}
}

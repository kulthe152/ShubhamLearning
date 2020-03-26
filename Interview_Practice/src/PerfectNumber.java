import java.io.*;
public class PerfectNumber 
{
	public static void main(String[] args) throws IOException 
	{
		int sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number");
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1;i<n;i++)
		{
			if(n % i == 0)
				sum = sum + i;
		}
		
		if(n==sum)
			System.out.println("Perfect");
		else
			System.out.println("not perfect");
	}
}

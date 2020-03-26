import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse_Number 
{
	public static void main(String args[])throws IOException
	{
		int r,temp,sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnetr the number for reverse ");
		int n = Integer.parseInt(br.readLine());
		temp=n;
		
		while(n!=0)
		{
			r = n % 10;
			n = n / 10;
			sum = sum * 10 + r;
		}
		
		System.out.println("reverse number is :-> "+sum);
	}
}

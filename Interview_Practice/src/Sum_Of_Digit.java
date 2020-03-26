import java.io.*;

public class Sum_Of_Digit 
{
	public static void main(String args[]) throws IOException
	{
		int r,n,sum=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("entr the number");
		n = Integer.parseInt(br.readLine());
		
		while(n>0)
		{
			r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		System.out.println("Sum of Digit is : "+sum);
	}
}

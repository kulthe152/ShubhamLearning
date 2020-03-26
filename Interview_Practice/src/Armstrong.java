import java.io.*;
public class Armstrong 
{
	public static void main(String[] args) throws IOException
	{
		int r,temp,s=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number :->");
		int n = Integer.parseInt(br.readLine());
		temp=n;
		while(n!=0)
		{
			r = n % 10;
			n = n / 10;
			s = s + r * r * r; 
		}
		if(temp==s)
			System.out.println("Given number is armstrong");
		else
			System.out.println("Given number is not armstrong");
	}
}

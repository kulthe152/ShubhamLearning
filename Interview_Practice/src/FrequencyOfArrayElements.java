import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrequencyOfArrayElements 
{
	public static void main(String args[]) throws NumberFormatException, IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n How many elemnets you want in array");
		int usrval = Integer.parseInt(br.readLine());
		System.out.println("enter then");
		int [] arr = new int [usrval];
		int [] fr = new int [arr.length];
		int vis = -1;
		for(int i=0;i<arr.length;i++)
		{
			int cnt = 1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					cnt++;
					fr[j] = vis;
				}
			}
			if(fr[i]!=vis)
			{
				fr[i]=cnt;
			}
		}
		
		for(int k=0;k<fr.length;k++)
		{
			if(fr[k]!=vis)
			{
				System.out.println(arr[k]+" number is repeated "+fr[k]+" times");
			}
		}
	}
}



/*
1. Division of 2 numbers without using / and % operator, 
2. Count the number of vowels from string ,
3. convert string to integer without using inbuilt API,Hex to Binary. 
4. Provide multiple direction to robot from array and check robot is on same position or not at the end, 
	replace space from line with %20 but you can replace only 1 character at time with space, pirates problem.
5. combine two json into single json, questions related to ajax call and jquery.  

1)print the frequency of character vowels in given string.
2) convert hexadecimal as binary number then coding round face to face 
3)print first 5 prime number.
4) print every 4 year is leap  

*/
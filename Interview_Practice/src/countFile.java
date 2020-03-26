//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.util.Scanner;
//
//public class countFile 
//{
//	public static void main(String args[]) throws FileNotFoundException
//	{
//		Scanner s1 = new Scanner(System.in);
//		FileOutputStream f = new FileOutputStream("C:\\Users\\Shubham\\Documents\\abc.txt");
//		Scanner sin = new Scanner(f);
//		int wrd = 0;
//		int lin = 0;
//		int chr = 0;
//		
//		while(sin.hasNext())
//		{
//			sin.next();
//			wrd++;
//		}
//		while(sin.hasNextLine())
//		{
//			sin.nextLine();
//			lin++;
//		}
//		while(sin.hasNextByte())
//		{
//			sin.nextByte();
//			chr++;
//		}
//		
//		System.out.println("Number of line:->"+ lin);
//		System.out.println("Number of word:->"+ wrd);
//		System.out.println("Number of char:->"+ chr);
//		
//	}
//}

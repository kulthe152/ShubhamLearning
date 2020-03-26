

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class connectDB {
	public static void main(String[] args)
	{
	Connection conn = null;
	String url = "INSERT INTO sampletable (stud_id, name) VALUES (3,'snehal')";
	try
	{
		conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/loginuser","root","7841080108");
		if(conn!=null)
		{
			System.out.println("Connected successfully");
		}
		
		PreparedStatement pst = (PreparedStatement) conn.prepareStatement(url);
		int status = pst.executeUpdate();
		if(status !=0)
		{
			System.out.println("Database was connection.. record was inserted");
		}
		
		
	}catch(Exception e)
	{
		System.out.println("Not Connected");
	}
}
}
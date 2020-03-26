package Services_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginService 
{
	public boolean check(String uname,String pass)
	{
		String url="jdbc:mysql://localhost:3307/javapractice";
		String u="root";
		String p="7841080108";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,u,p);
			PreparedStatement pst = conn.prepareStatement("select * from logintable where uname=? and pass=?");
			pst.setString(1,uname);
			pst.setString(2,pass);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				return true;
			}
		}
		catch(Exception e) {System.out.println(e);}
		
		return false;
	}
}

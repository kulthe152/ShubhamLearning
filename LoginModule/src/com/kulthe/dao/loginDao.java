package com.kulthe.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDao 
{

	String url = "jdbc:mysql://localhost:3307/javapractice";
	String udb = "root";
	String pdb = "7841080108";
	String qry = "select * from loginTable where uname=? and pass=?";
	
	public boolean check(String uname,String pass)
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,udb,pdb);
			PreparedStatement pst = conn.prepareStatement(qry);
			pst.setString(1, uname);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				return true;
			}
			
		}catch(Exception e) {e.printStackTrace();}
		return false;
	}
}



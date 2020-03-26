package com.kulthe.web.dao;

import com.kulthe.web.model.Student;
import java.sql.*;

public class StudentDao 
{
	public Student getStudent(int sid)
	{
		Student s = new Student();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/loginuser","root","7841080108");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from student where srno="+sid);
			if(rs.next())
			{
				s.setSid(rs.getInt("srno"));
				s.setSnm(rs.getString("snm"));
				s.setSage(rs.getInt("sage"));
			}
			
		}catch(Exception e) {System.out.println(e);}
		
		return s;
	}
}

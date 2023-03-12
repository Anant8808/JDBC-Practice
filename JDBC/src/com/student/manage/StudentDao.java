package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	
	public static boolean insert(Student st)

	{
		boolean f=false;
		try {
		Connection con=	CP.createC();
		String q="insert into Student(sname,saddress,scity) values(?,?,?)";
		PreparedStatement psmt=con.prepareStatement(q);
		psmt.setString(1, st.getStudentname());
		psmt.setString(2, st.getStudentaddress());
		psmt.setString(3, st.getStudentcity());
		psmt.executeUpdate();
		f=true;
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}
	public static boolean delete(int uid)
	{
		boolean f=false;
		try {
		Connection con=	CP.createC();
		String q="delete from Student where sid=?";
		PreparedStatement psmt=con.prepareStatement(q);
		psmt.setInt(1,uid);
		
		psmt.executeUpdate();
		f=true;
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}
	
	public static boolean showsingle(int uid)

	{
		boolean f=false;
		try {
		Connection con=	CP.createC();
		String q="select * from Student where sid=?";
		PreparedStatement smt=con.prepareStatement(q);
		smt.setInt(1,uid);
		
		ResultSet set=smt.executeQuery();
		
		while(set.next())
		{
			int id=set.getInt(1);
			String name=set.getString(2);
			String address=set.getString(3);
			String city=set.getString(4);
			
			System.out.println("ID"+" "+id+" "+"NAME"+" "+name+" "+"addresss"+" "+address+" "+"City"+" "+city);
			
		}
		
	
		f=true;
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}
	public static boolean showall()
	{
		boolean f=false;
		try {
		Connection con=	CP.createC();
		String q="select * from Student";
		Statement smt=con.createStatement();
		ResultSet set=smt.executeQuery(q);
		
		while(set.next())
		{
			int id=set.getInt(1);
			String name=set.getString(2);
			String address=set.getString(3);
			String city=set.getString(4);
			
			System.out.println("ID"+" "+id+" "+"NAME"+" "+name+" "+"addresss"+" "+address+" "+"City"+" "+city);
			
		}
		
	
		f=true;
			
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return f;
	}
}

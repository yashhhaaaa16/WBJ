package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.bean.Student;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

public class StudentDAO {

	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Connection con = null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://192.168.100.80:3306/group023","group023","welcome");
		return con;
	}
	
	public static int registerStudent(Student s) throws SQLException, ClassNotFoundException
	{
		int i = 0;
		
		try {
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("insert into student1 (PRN,NAME,MARKS1,MARKS2,MARKS3) values (?,?,?,?,?)");
		stmt.setInt(1,s.getPrn());
		stmt.setString(2, s.getName());
		stmt.setFloat(3, s.getS1());
		stmt.setFloat(4, s.getS2());
		stmt.setFloat(5, s.getS3());
		i = stmt.executeUpdate();
		return i;
		}catch (Exception e) {
					// TODO: handle exception
				return i;
		}
	}
	
	public static Student getStudentbyPrn(int prn) throws ClassNotFoundException, SQLException
	{
		Student s = new Student();
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("select * from student1 where prn = ?");
		stmt.setInt(1, prn);
		ResultSet rs = stmt.executeQuery();
		boolean status = rs.next();
		
		if(status)
		{
			s.setPrn(rs.getInt(2));
			s.setName(rs.getString(3));
			s.setS1(rs.getFloat(4));
			s.setS2(rs.getFloat(5));
			s.setS3(rs.getFloat(6));
		}
		return s;
	}
}

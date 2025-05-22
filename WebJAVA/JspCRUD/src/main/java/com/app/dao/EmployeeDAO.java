package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.Employee;

public class EmployeeDAO {

	public static Connection getConnection()
	{
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver found");
			con = DriverManager.getConnection("jdbc:mysql://192.168.100.80/group023","group023","welcome");
			System.out.println("Connection Established");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return con;
	}
	
	public static int saveEMP (Employee e) throws SQLException
	{
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("insert into emptb (name,password,email,gender,country) values(?,?,?,?,?)");
		stmt.setString(1,e.getName());
		stmt.setString(2, e.getPassword());
		stmt.setString(3, e.getEmail());
		stmt.setString(4, e.getGender());
		stmt.setString(5, e.getCountry());
		int status = stmt.executeUpdate();
		
		return status;
	}
	
	public static List<Employee> getAllEmployees() throws SQLException
	{
		List<Employee> l = new ArrayList<Employee>();
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("select * from emptb");
		ResultSet rs = stmt.executeQuery();
		while(rs.next())
		{
			Employee e = new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setPassword(rs.getString(3));
			e.setEmail(rs.getString(4));
			e.setGender(rs.getString(5));
			e.setCountry(rs.getString(6));
			l.add(e);
		}
		return l;
	}
	public static int updateEmployee(Employee e) throws SQLException
	{
		int i = 0;
		try
		{
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("update emptb set name=?,password=?,email=?,gender=?,country=? where id=?");
		stmt.setString(1, e.getName());
		stmt.setString(2, e.getPassword());
		stmt.setString(3, e.getEmail());
		stmt.setString(4, e.getGender());
		stmt.setString(5, e.getCountry());
		stmt.setInt(6, e.getId());
		i = stmt.executeUpdate();
		}catch (Exception e1) {
			return i;
		}
		return i;
	}
	
	public static Employee getEmployeeId(int id) throws SQLException
	{
		Employee e = null;
		Connection con = getConnection();
		PreparedStatement stmt = 
				con.prepareStatement("select *from emptb where id=?");
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		while(rs.next())
		{
			e = new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setPassword(rs.getString(3));
			e.setEmail(rs.getString(4));
			e.setGender(rs.getString(5));
			e.setCountry(rs.getString(6));
		}
		return e;
	}
	
	public static int deleteEmployeeById(int id) throws SQLException
	{
		int i = 0;
		try {
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("delete from emptb where id=?");
		stmt.setInt(1, id);
		i = stmt.executeUpdate();
		
		return i;
		}catch (Exception e) {
			return i;
		}
	}
}

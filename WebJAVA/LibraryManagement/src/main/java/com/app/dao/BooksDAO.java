package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.bean.Books;

public class BooksDAO {

	public static Connection getConnection()
	{
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Found");
			con = DriverManager.getConnection("jdbc:mysql://192.168.100.80/group023","group023","welcome");
			System.out.println("Connection Established");
		}
		catch (Exception e) {
			e.printStackTrace();
			return con;
		}
		return con;
	}
	
	public static int saveBooks (Books b) throws SQLException
	{
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("insert into library (bookName, authorName, language, price, publishedYear) values(?,?,?,?,?)");
		stmt.setString(1, b.getBookName());
		stmt.setString(2, b.getAuthorName());
		stmt.setString(3, b.getLanguage());
		stmt.setFloat(4, b.getPrice());
		stmt.setInt(5, b.getPublishedYear());
		
		int i = stmt.executeUpdate();
		
		return i;
	}
	
	public static List<Books> getAllBooks() throws SQLException
	{
		List<Books> l = new ArrayList<Books>();
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("select * from library");
		ResultSet rs = stmt.executeQuery();
		while(rs.next())
		{
			Books b = new Books();
			b.setId(rs.getInt(1));
			b.setBookName(rs.getString(2));
			b.setAuthorName(rs.getString(3));
			b.setLanguage(rs.getString(4));
			b.setPrice(rs.getFloat(5));
			b.setPublishedYear(rs.getInt(6));
			l.add(b);
		}
		return l;
	}
	
	public static int updateBooks(Books b) throws SQLException
	{
		int i = 0;
		try
		{
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("update library set bookName=?,authorName=?,language=?,price=?,publishedYear=? where id=?");
		stmt.setString(1, b.getBookName());
		stmt.setString(2, b.getAuthorName());
		stmt.setString(3, b.getLanguage());
		stmt.setFloat(4, b.getPrice());
		stmt.setInt(5, b.getPublishedYear());
		stmt.setInt(6, b.getId());
		i = stmt.executeUpdate();
		
		}catch (Exception e) {
			
		}
		return i;
	}
	
	public static Books getBookId(int id) throws SQLException
	{
		Books b = null;
		Connection con = getConnection();
		PreparedStatement stmt = 
				con.prepareStatement("select *from library where id=?");
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		while(rs.next())
		{
			b = new Books();
			b.setBookName(rs.getString(2));
			b.setAuthorName(rs.getString(3));
			b.setLanguage(rs.getString(4));
			b.setPrice(rs.getFloat(5));
			b.setPublishedYear(rs.getInt(6));
		}
		return b;
	}
	
	public static int deleteBookById(int id) throws SQLException
	{
		int i = 0;
		try {
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("delete from library where id=?");
		stmt.setInt(1, id);
		i = stmt.executeUpdate();
		
		return i;
		}catch (Exception e) {
			return i;
		}
	}
}

package daoLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.mysql.cj.jdbc.CallableStatement;

import Model.Book;
import Model.DbDetails;

public class DuoLayer {
	String username = "root";
	String pwd = "root";
	String url = "	";
	String insqry = "insert into Book(name,author,price,qty) values(?,?,?,?)";
	String upqry = "update Book set name=?,author=?,price=?,qty=? where bookid=?";
	String dltqry = "Delete from book where bookid=?";
	String getqry = "select * from book where bookid=?";
    String getall= "select * from book";
	public String insert(Book obj,DbDetails d1) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		try {
			Connection con = DriverManager.getConnection(d1.getUrl(), d1.getUsername(), d1.getPwd());
			PreparedStatement pr = con.prepareStatement(insqry);
			pr.setString(1, obj.getName());
			pr.setString(2, obj.getAuthor());
			pr.setInt(3, obj.getPrice());
			pr.setInt(4, obj.getQuantity());
			int result = pr.executeUpdate();
			if (result > 0) {
				return "book added to library";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}

		return "something went wrong";
	}

	public String update(Book obj) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		try {
			Connection con = DriverManager.getConnection(url, username, pwd);
			PreparedStatement pr = con.prepareStatement(upqry);
			pr.setString(1, obj.getName());
			pr.setString(2, obj.getAuthor());
			pr.setInt(3, obj.getPrice());
			pr.setInt(4, obj.getQuantity());
			pr.setInt(5, obj.getBookid());
			int result = pr.executeUpdate();
			if (result > 0) {
				return "book updated to library";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}

		return "something went wrong";
	}

	public String delete(int id, DbDetails db) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		try {
			Connection con = DriverManager.getConnection(db.getUrl(), db.getUsername(),db.getPwd());
			PreparedStatement pr = con.prepareStatement(dltqry);
			pr.setInt(1, id);
			int result = pr.executeUpdate();
			if (result > 0) {
				return "book deleted successfully";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		return "something went wrong";

	}

	public Book getbyid1(int id) {
		int a1= id;
		Book b1 = new Book();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		try {
			Connection con = DriverManager.getConnection(url, username, pwd);
			//PreparedStatement pr = con.prepareStatement(getqry);
			java.sql.CallableStatement cs = con.prepareCall("{call my_procedure(?)}");
			//pr.setInt(1,a1);
			//ResultSet r1 = pr.executeQuery();
			cs.setInt(1, a1);
			ResultSet r1= cs.executeQuery();
			while(r1.next()) {
				b1.setBookid(r1.getInt("bookid"));
				b1.setName(r1.getString("name"));
				b1.setAuthor(r1.getString("author"));
				b1.setPrice(r1.getInt("price"));
				b1.setQuantity(r1.getInt("qty"));
			}
			
			con.close();
			//pr.close();
			cs.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		return b1;

	}
	public List<Book> getallbook(){
		List<Book> allbook =new ArrayList<Book>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		try {
			Connection con = DriverManager.getConnection(url, username, pwd);
			PreparedStatement pr = con.prepareStatement(getall);
			ResultSet r1 = pr.executeQuery();
			while(r1.next()) {
				int id= r1.getInt("bookid");
				String name= r1.getString("name");
				String author= r1.getString("author");
				int price= r1.getInt("price");
				int qty= r1.getInt("qty");
				Book b1= new Book(id, name, author, price, qty);
				allbook.add(b1);
			}
			
			con.close();
			pr.close();
			Collections.sort(allbook);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}
		return allbook;
	}
}

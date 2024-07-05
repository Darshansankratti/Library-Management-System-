package Servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BookService.BookService;
import Model.Book;
import Model.DbDetails;

public class CreateServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		ServletConfig config= getServletConfig();
		String url= config.getInitParameter("url");
		String username= config.getInitParameter("username");
		String pwd= config.getInitParameter("pwd");
		String name= arg0.getParameter("name");
		String author= arg0.getParameter("author");
		int price= Integer.parseInt(arg0.getParameter("price"));
		int qty= Integer.parseInt(arg0.getParameter("qty"));
		
		DbDetails d1= new DbDetails(url, username, pwd);
		
		Book b1= new Book();
		b1.setName(name);
		b1.setAuthor(author);
		b1.setPrice(price);
		b1.setQuantity(qty);
		BookService s1= new BookService();
		String r= s1.createbook(b1,d1);
		arg0.setAttribute("a", r);
		arg0.getRequestDispatcher("CreateResponse.jsp").forward(arg0, arg1);
		
		
		
	}

}

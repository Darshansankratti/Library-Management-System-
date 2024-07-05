package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BookService.BookService;
import Model.Book;

public class UpdateServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		int id= Integer.parseInt(arg0.getParameter("id"));
		String name= arg0.getParameter("name");
		String author= arg0.getParameter("author");
		int price= Integer.parseInt(arg0.getParameter("price"));
		int qty= Integer.parseInt(arg0.getParameter("qty"));
		
		Book b1= new Book();
		b1.setBookid(id);
		b1.setName(name);
		b1.setAuthor(author);
		b1.setPrice(price);
		b1.setQuantity(qty);
		BookService s1= new BookService();
		String r= s1.updateBook(b1);
		arg0.setAttribute("a", r);
		arg0.getRequestDispatcher("UpdateResponse.jsp").forward(arg0, arg1);
	}

}

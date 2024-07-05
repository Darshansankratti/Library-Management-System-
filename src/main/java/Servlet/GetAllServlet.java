package Servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BookService.BookService;
import Model.Book;

public class GetAllServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		List<Book> books = new ArrayList<Book>();
	    BookService bs= new BookService();
	    books= bs.getall();
	    arg0.setAttribute("all",books);
	    arg0.getRequestDispatcher("GetAllResponse.jsp").forward(arg0, arg1);
	}

}

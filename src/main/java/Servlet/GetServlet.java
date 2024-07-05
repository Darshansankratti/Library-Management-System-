package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BookService.BookService;
import Model.Book;

public class GetServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		int id= Integer.parseInt(arg0.getParameter("id"));
		BookService b1= new BookService();
		Book res= b1.getbyid(id);
		arg0.setAttribute("get", res);
		arg0.getRequestDispatcher("GetResponse.jsp").forward(arg0, arg1);
	}

}
